public class MinhaCarteira {

    String nome;

    double reserva;

    String perfilInvestimento;

    // Constructor com parâmetros
    public void Produto(String nome, double reserva, String perfilInvestimento){
        this.nome = nome;
        this.reserva = reserva;
        this.perfilInvestimento = perfilInvestimento;

    }

    // Constructor padrão
    public MinhaCarteira(){}

    // Constructor para exibir informações

    public void exibirInformacoes() {
        System.out.println("Nome do Usuário: " + nome);
        System.out.println("Valor Investido: R$" + reserva);
        System.out.println("Perfil de Investidor: " + perfilInvestimento);
    }


    // Constructor para compra de ações
    public void comprar(int quantidadeComprada, int quantidade) {
        if (quantidadeComprada <= quantidade) {
            quantidade -= quantidadeComprada;
            System.out.println("Sua ação foi comprada! Saldo restante: R$ " + quantidade);

        } else {
            System.out.println("Saldo Insuficiente!");
        }

    }

    // Constructor para adicionar saldo

    public void adicionarSaldo(double quantidadeAdicional, int quantidade){
        quantidade += quantidadeAdicional;
        System.out.println("Quantidade adicionada! Saldo atual:R$ " + quantidade);
    }


}
