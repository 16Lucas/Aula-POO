public class Carro {
    // Atributos
    String nome;
    String marca;
    int ano;
    int velocidade;

    // metodos
    void acelerar(int aceleracao) {
        velocidade += aceleracao;
        System.out.println("Acelerando vruuummmm...");
    }

    void frear(int reduzir){
        velocidade -= reduzir;
        System.out.println("Reduzindo shhhiiin");
    }

    int velocimentro(){
        return velocidade;
    }
}
