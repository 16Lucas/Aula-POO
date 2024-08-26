public class testaAluno {
    public static  void main(String[] args){
        // Instanciando Objetos //
        aluno aluno1 = new aluno();
        aluno aluno2 = new aluno();

        aluno1.nome = "Mariana";
        aluno1.idade = 22;
        aluno1.curso = "Java Orientado a Objetos";

        aluno2.nome = "Leticia";
        aluno2.idade = 23;
        aluno2.curso = "POO";


        aluno1.assistiraula();
        aluno2.assistiraula();
    }
}
