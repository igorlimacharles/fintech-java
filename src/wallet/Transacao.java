package wallet;

import category.Category;
import user.UsuarioBase;

public class Transacao {
    private int id;
    private UsuarioBase usuario;
    private Category categoria;
    private String descricao;
    private double valor;
    private String data;

    public Transacao(int id, UsuarioBase usuario, Category categoria, String descricao, double valor, String data) {
        this.id = id;
        this.usuario = usuario;
        this.categoria = categoria;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setter para descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTransacao() {
        System.out.println("Transação: " + descricao + ", Valor: " + valor);
    }
}
