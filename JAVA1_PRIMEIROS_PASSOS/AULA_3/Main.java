/**
 * Exercicio2
 */
class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Marcelo Villas Bôas Magrinelli";
        funcionario.salario = 200000.0;
        funcionario.data.dia = 06;
        funcionario.data.mes = 04;
        funcionario.data.ano = 1992;
        funcionario.rg = "123456789";

        System.out.println(funcionario.nome);
        System.out.println(funcionario.salario);
        System.out.println(funcionario.data.dia + "/" + funcionario.data.mes + "/" + funcionario.data.ano);
        System.out.println(funcionario.rg);

        funcionario.recebeAumento(500000);
        System.out.println(funcionario.salario);

        System.out.println(funcionario.calculaGanhoAnual());

        /**
         * Exercicio 4
         */

        Funcionario funcionario2 = new Funcionario();

        funcionario2.nome = "Marcelo Villas Bôas Magrinelli";
        funcionario2.salario = 200000.0;
        funcionario2.data.dia = 01;
        funcionario2.data.mes = 01;
        funcionario2.data.ano = 1954;
        funcionario2.rg = "123456789";

        System.out.println(funcionario2.nome);
        System.out.println(funcionario2.salario);
        System.out.println(funcionario2.data.dia + "/" + funcionario2.data.mes + "/" + funcionario2.data.ano);
        System.out.println(funcionario2.rg);

        funcionario2.recebeAumento(500000);
        System.out.println(funcionario2.salario);

        System.out.println(funcionario2.calculaGanhoAnual());

        /**
         * Exercicio 5
         */
        funcionario = funcionario2;

        if( funcionario == funcionario2 ){
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}