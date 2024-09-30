public class Tarefa {
    public int id_tarefa;
    public String nome_tarefa;
    private int nota;

    public Tarefa(int id_tarefa, String nome_tarefa, int nota){
        this.id_tarefa = id_tarefa;
        this.nome_tarefa = nome_tarefa;
        this.nota = nota;
        System.out.println("<<Construtor 01 >>");

    }

    public Tarefa(int id_tarefa, String nome_tarefa){
        this.id_tarefa = id_tarefa;
        this.nome_tarefa = nome_tarefa;
        setNota(0);
        System.out.println("<<Construtor 02 >>");
    }


    public void setNota(int nota){
        this.nota = nota;
    }

    public int getNota(){
        return this.nota;
    }

    public void info(){
        System.out.println("ID Tarefa: " + this.id_tarefa);
        System.out.println("Nome: " + this.nome_tarefa);
        System.out.println("Nota: " + getNota());
        System.out.println("-------------");
    }

}
