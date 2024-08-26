public class testacCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2020;
        c1.velocidade = 90;

        System.out.println("velocidade " + c1.nome + "= " +  c1.velocimentro());
        c1.acelerar(30);
        System.out.println("Velocidade Atual " + c1.velocimentro());
        c1.frear(10);
        System.out.println("Velocidade Atual " + c1.velocimentro());


    }
}
