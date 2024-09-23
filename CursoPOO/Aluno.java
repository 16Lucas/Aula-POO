public class Aluno {

    private String nome;
    private int matricula;
    private double notaMat;
    private double notaPor;
    private double notaFis;
    private double notaGeo;
    private double notaQuim;
    private Disciplina disciplina;

    public Aluno(String nome, int matricula, double notaMat, double notaPor, double notaFis, double notaGeo, double notaQuim, Disciplina disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaMat = notaMat;
        this.notaPor = notaPor;
        this.notaFis = notaFis;
        this.notaGeo = notaGeo;
        this.notaQuim = notaQuim;
        this.disciplina = disciplina;
    }

    public double calcularMedia() {
        return (notaMat + notaPor + notaFis + notaGeo + notaQuim) / 5;
    }

    public String situacaoAluno() {
        double media = calcularMedia();
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }

    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + situacaoAluno());
        disciplina.info();
    }
}
