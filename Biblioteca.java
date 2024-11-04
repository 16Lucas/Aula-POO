public class Biblioteca {
    public static void main(String[] args) {
        Material livro = new Livro("Java: Como Programar", 2020);
        Material revista = new Revista("Revista de Tecnologia", 2023);

        livro.exibirInformacoes();
        System.out.println("Multa por 5 dias de atraso: R$" + livro.calcularMulta(5));

        revista.exibirInformacoes();
        System.out.println("Multa por 5 dias de atraso: R$" + revista.calcularMulta(5));
    }
}
