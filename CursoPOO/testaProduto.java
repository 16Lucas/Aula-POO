public class testaProduto{
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook");
        System.out.println(produto1.exibirInformacoes());

        Produto produto2 = new Produto("Smartphone", 2500.50, 10);
        System.out.println(produto2.exibirInformacoes());

    }

}
