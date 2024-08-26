public class ContaBancaria {
    // Atributos
    String numero;
    String titular;
    int saldo;

    //metodos

    void depositar(int deposito){
        saldo += deposito;

    }
    void sacar(int saque){
        saldo -= saque;
    }
    int exibir(){
        return saldo;
    }
}
