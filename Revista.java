public class Revista extends Material {
    public Revista(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double taxaPorDia = 1.5;
        return diasAtraso * taxaPorDia;
    }
}