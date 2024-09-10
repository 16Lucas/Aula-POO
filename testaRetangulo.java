public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        retangulo1.largura = 5.0;
        retangulo1.altura = 3.0;

        retangulo2.largura = 7.5;
        retangulo2.altura = 4.2;

        retangulo1.exibirArea();
        retangulo2.exibirArea();
    }
}