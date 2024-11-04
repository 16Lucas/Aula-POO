public class Livro extends Material {
    public Livro(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double taxaPorDia = 2.0;
        return diasAtraso * taxaPorDia;
    }
}
