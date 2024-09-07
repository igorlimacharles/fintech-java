package wallet;

// Classe base wallet.ItemFinanceiro
public abstract class ItemFinanceiro {
    protected String tipo;
    protected double valor;
    protected String categoria;

    public ItemFinanceiro(String tipo, double valor, String categoria) {
        this.tipo = tipo;
        this.valor = valor;
        this.categoria = categoria;
    }

    // Método abstrato para exibir detalhes
    public abstract void exibirDetalhes();


    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
