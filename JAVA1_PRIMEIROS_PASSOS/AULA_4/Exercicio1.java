class Funcionario {
    
        String nome;
        double salario;
        Data data;
        String rg;
    
        Funcionario (){
            this.data = new Data();
        }
    
        void recebeAumento (double valorDoAumento) {
            
            this.salario += valorDoAumento;
        }
    
        double calculaGanhoAnual (){
    
            return this.salario * 12;
        }
    
        /*
        *   Exercício 3
        */
        void mostra (){
            System.out.println("Nome: " + this.nome +
            "\nSalario: " + this.salario +
            "\nData de Entrada no Banco: " + this.data.getFormatada() +
            "\nRG: " + this.rg + "\n");
        }
    }

    class Data {
        
        int dia;
        int mes;
        int ano;
    
        String getFormatada(){
            return this.dia + "/" + this.mes + "/" + this.ano;
        }
    }


    /**
     * Exercicio 1
     */
    class Empresa {

        String nome;
        int cnpj;
        Funcionario[] funcionarios;

        /**
         * Exercicio 2
         */
        void adiciona (Funcionario f) {

            for (int i = 0; i < this.funcionarios.length; i++){
        
                if (this.funcionarios[i] != null) continue;
                this.funcionarios[i] = f;
                break;
            }            
        }

        /**
         * Exercicio 4 / Exercicio 5
         */
        void mostraFuncionarios (){

            for (int i = 0; i < this.funcionarios.length; i++){
                
                if (this.funcionarios[i] == null) continue;
                this.funcionarios[i].mostra();
            }
        }

        boolean contem (Funcionario f){

            for (int i = 0; i < this.funcionarios.length; i++){
                
                if (this.funcionarios[i].equals(f)){

                    return true;
                }                
            }

            return false;
        }
    }