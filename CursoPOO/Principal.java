public class Principal {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina("Matemática", 60);

        Aluno aluno1 = new Aluno("Maria", 12345, 7.5, 6.8, 5.0, 7.2, 8.0, disciplina1);

        aluno1.info();
    }
}
