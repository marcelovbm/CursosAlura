class TesteEmpresa {

    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        empresa.funcionarios = new Funcionario[10];

        Funcionario f1 = new Funcionario();
        f1.nome = "Marcelo Magrinelli";
        f1.salario = 1000;
        f1.rg = "1234567890";
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.nome = "Higino Magrinelli";
        f2.salario = 2000;
        f2.rg = "1234567890";
        empresa.adiciona(f2);

        Funcionario f3 = new Funcionario();
        f3.nome = "Neusa Magrinelli";
        f3.salario = 3000;
        f3.rg = "1234567890";
        empresa.adiciona(f3);

        empresa.mostraFuncionarios();

        if (empresa.contem(f2)){
            System.out.println("True");
        }
    }
}