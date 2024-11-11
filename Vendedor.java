public class Vendedor extends Funcionario {
    private double totalVendasMes;

    public Vendedor(String nome, String cpf, double salarioBase, double totalVendasMes) {
        super(nome, cpf, salarioBase);
        this.totalVendasMes = totalVendasMes;
    }

    @Override
    public double calculaSalario() {
        return salarioBase + (totalVendasMes * 0.05);
    }
}
