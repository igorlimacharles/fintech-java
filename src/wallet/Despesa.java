package wallet;

public class Despesa extends ItemFinanceiro {
    public Despesa(double valor, String categoria) {
        super("wallet.Despesa", valor, categoria);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor da wallet.Despesa: R$ " + valor);
    }
}