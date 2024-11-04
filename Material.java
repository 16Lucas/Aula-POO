public class Material {
    private String titulo;
    private int anoPublicacao;

    public Material(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public double calcularMulta(int diasAtraso) {
        return 0;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Ano de Publicação: " + anoPublicacao);
    }
}