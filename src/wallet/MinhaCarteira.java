package wallet;

import java.util.ArrayList;
import java.util.List;

public class MinhaCarteira {
    private String nome;
    private List<ItemFinanceiro> itensFinanceiros = new ArrayList<>();
    private int contadorDeItens = 0; // Contador para os itens

    public MinhaCarteira(String nome) {
        this.nome = nome;
    }

    // Método para adicionar um item financeiro
    public void adicionarItemFinanceiro(ItemFinanceiro item) {
        itensFinanceiros.add(item);
        contadorDeItens++;
        System.out.println(contadorDeItens + "º item adicionado à carteira.");
    }

    // Método para exibir os itens financeiros
    public void exibirCarteira() {
        System.out.println("\n--- Carteira de " + nome + " ---");
        for (ItemFinanceiro item : itensFinanceiros) {
            item.exibirDetalhes();
            System.out.println("---");
        }
    }
}