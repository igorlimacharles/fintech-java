package wallet;
import user.UsuarioBase;

public class Planejamento {
    private int id;
    private UsuarioBase usuario;
    private String descricao;
    private double valorAlvo;
    private double valorInicial;
    private String dataInicio;
    private String dataFim;

    public Planejamento(int id, UsuarioBase usuario, String descricao, double valorAlvo, double valorInicial, String dataInicio, String dataFim) {
        this.id = id;
        this.usuario = usuario;
        this.descricao = descricao;
        this.valorAlvo = valorAlvo;
        this.valorInicial = valorInicial;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void exibirPlanejamento() {
        System.out.println("Planejamento: " + descricao + ", Valor Alvo: R$" + valorAlvo);
    }
}
