package wallet;

public class PerfilConsumo {
    private double salario;
    private double despesas;
    private String perfil;

    public PerfilConsumo(double salario, double despesas) {
        this.salario = salario;
        this.despesas = despesas;
        definirPerfil();
    }

    private void definirPerfil() {
        double percentualDespesas = (despesas / salario) * 100;

        if (percentualDespesas < 30) {
            this.perfil = "baixo";
        } else if (percentualDespesas >= 30 && percentualDespesas <= 60) {
            this.perfil = "mediano";
        } else {
            this.perfil = "consumista";
        }
    }

    public void exibirPerfil() {
        System.out.println("Salário: R$ " + salario);
        System.out.println("Despesas: R$ " + despesas);
        System.out.println("Perfil de Consumo: " + perfil);
    }
}