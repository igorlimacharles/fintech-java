package wallet;

public class Investimento extends ItemFinanceiro {
    public Investimento(double valor, String categoria) {
        super("Investimento", valor, categoria);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor Investido: R$ " + valor);
    }
}