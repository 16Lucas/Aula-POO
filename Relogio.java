public class Relogio {

    public void imprimirTempoRestanteDia(int hora) {
        int horasRestantes = 24 - hora;
        System.out.println("Faltam " + horasRestantes + " horas para encerrar o dia.");
    }

    public void imprimirTempoRestanteDia(int hora, int minuto) {
        int horasRestantes = 23 - hora;
        int minutosRestantes = 60 - minuto;

        if (minutosRestantes == 60) {
            minutosRestantes = 0;
            horasRestantes++;
        }

        System.out.println("Faltam " + horasRestantes + " horas e " + minutosRestantes + " minutos para encerrar o dia.");
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        relogio.imprimirTempoRestanteDia(13);
        relogio.imprimirTempoRestanteDia(11, 15);
    }
}
