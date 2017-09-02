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
        System.out.println("Nome: " + this.nome +
        "\nSalario: " + this.salario +
        "\nData de Entrada no Banco: " + this.data.getFormatada() +
        "\nRG: " + this.rg);
    }
}