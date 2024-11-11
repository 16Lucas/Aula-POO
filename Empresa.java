public class Empresa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", "123.456.789-00", 5000.0);
        Vendedor vendedor1 = new Vendedor("Ana", "987.654.321-00", 2000.0, 30000.0);
        Vendedor vendedor2 = new Vendedor("João", "456.789.123-00", 2000.0, 20000.0);
        Vendedor vendedor3 = new Vendedor("Maria", "789.123.456-00", 2000.0, 10000.0);

        gerente.imprimirDados();
        System.out.println("Salário: " + gerente.calculaSalario() + "\n");

        vendedor1.imprimirDados();
        System.out.println("Salário: " + vendedor1.calculaSalario() + "\n");

        vendedor2.imprimirDados();
        System.out.println("Salário: " + vendedor2.calculaSalario() + "\n");

        vendedor3.imprimirDados();
        System.out.println("Salário: " + vendedor3.calculaSalario() + "\n");

        double somaSalarios = gerente.calculaSalario() + vendedor1.calculaSalario() +
                vendedor2.calculaSalario() + vendedor3.calculaSalario();
        System.out.println("Soma dos salários de todos os funcionários: " + somaSalarios);
    }
}
