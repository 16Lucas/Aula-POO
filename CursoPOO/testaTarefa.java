public class testaTarefa {
    public static void main(String[] args){

        Tarefa t1 = new Tarefa(1,"Tarefa 01", 10);
        Tarefa t2 = new Tarefa(2,"Tarefa 02", 20);
        Tarefa t3 = new Tarefa(3,"Tarefa 03");

        t1.info();
        t2.info();
        t3.info();
    }

}
