/**
 * Funcionario - Exercício 1
 */
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
        System.out.println("Nome: " + this.nome + "\n" + 
        "Salario: " + this.salario + "\n" +
        "Data de Entrada no Banco: " + this.data.dia + "/" + this.data.mes + "/" + this.data.ano +
        "RG: " + this.rg);
    }
}