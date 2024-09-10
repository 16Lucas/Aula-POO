public class testaPessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "João";
        pessoa1.idade = 30;
        pessoa1.cidade = "São Paulo";

        pessoa2.nome = "Maria";
        pessoa2.idade = 25;
        pessoa2.cidade = "Rio de Janeiro";

        pessoa1.apresentar();
        System.out.println();
        pessoa2.apresentar();
    }
}