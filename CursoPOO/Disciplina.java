public class Disciplina {

    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void info() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
}
