public class ItemFinanceiro {

    String tipo;
    double valor;
    String categoria;


    // Constructor padrão
    public ItemFinanceiro() {

    }


    // Constructor com parâmetros
    public void registerItem(String tipo, double valor, String categoria) {
        this.tipo = tipo;
        this.valor = valor;
        this.categoria = categoria;
    }


    // Constructor para exibir o tipo guardado
    public String getTipo() {
        return tipo;
    }

    // Constructor para setar o tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Constructor para exibir o valor guardado
    public double getValor() {
        return valor;
    }

    // Constructor para setar o valor
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Constructor para exibir a categoria guardada
    public String getCategoria() {
        return categoria;
    }

    // Constructor para setar a categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    // Constructor para exibir todas as informações do item
    public void showItens() {
        System.out.println(tipo);
        System.out.println(categoria);
        System.out.println(valor);
    }
}
