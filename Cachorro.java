public class Cachorro {
    
    String raca;
    int tamanho;
    String cor;
    boolean tem_rabo;

    
    void late() {
        String rabo = tem_rabo ? "tenho rabo" : "não tenho rabo";
        System.out.println("Eu sou o " + raca + " de tamanho " + tamanho + 
                           ", minha cor é " + cor + " e eu " + rabo + "...");
    }
}