package wallet;

import user.UsuarioBase;
import category.Category;

public class Investimento extends Transacao {
    private double rentabilidade;
    private String risco;
    private String dataVencimento;

    public Investimento(int id, UsuarioBase usuario, Category categoria, String descricao, double valor, String data, double rentabilidade, String risco, String dataVencimento) {
        super(id, usuario, categoria, descricao, valor, data);
        this.rentabilidade = rentabilidade;
        this.risco = risco;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void exibirTransacao() {
        System.out.println("Investimento: " + getDescricao() + ", Rentabilidade: " + rentabilidade + "%, Risco: " + risco);
    }
}

