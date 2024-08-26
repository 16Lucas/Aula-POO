public class testaContaBancaria {
    public static void main(String[] argd) {
        ContaBancaria cb = new ContaBancaria();

        cb.numero = "10";
        cb.titular = "Lucas";
        cb.saldo = 100;

        System.out.println("Numero da conta: " + cb.numero);
        cb.depositar(100);
        System.out.println("nome do titular da conta: " + cb.titular);
        cb.sacar(50);
        System.out.println("Saldo em conta: " + cb.exibir());

    }
}
