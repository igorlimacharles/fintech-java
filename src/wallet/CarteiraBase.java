package wallet;

public class CarteiraBase {
    protected String nome;
    protected double saldo;

    public CarteiraBase(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
        System.out.println("Novo saldo: R$ " + saldo);
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
