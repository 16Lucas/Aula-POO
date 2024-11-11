public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return salarioBase * 3;
    }
}
