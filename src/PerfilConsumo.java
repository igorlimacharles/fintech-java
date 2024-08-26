// Essa classe guarda informações referente ao perfil de consumo do usuário.

public class PerfilConsumo {

    String nome;
    int idade;
    double salario;
    double despesas;
    String perfil;


    // Constructor para definir informações completas de perfil
    public void setPerfilCompleto (String nome, int idade, String perfil) {
        this.nome = nome;
        this.idade = idade;
        this.perfil = perfil;
    }

    // Constructor para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Constructor para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Constructor para definir as despesas
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }


    // Constructor para definir o perfil
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    // Constructor para definir o salário
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Constructor para exibir o nome
    public String getNome() {
        return nome;
    }

    // Constructor para exibir as despesas
    public double getDespesas() {
        return despesas;
    }

    // Constructor para exibir o salário
    public double getSalario() {
        return salario;
    }

    // Constructor para exibir a idade
    public int getIdade() {
        return idade;
    }

    // Constructor para exibir o perfil
    public String getPerfil() {
        return perfil;
    }

    // Constructor para exibir informações completas de perfil
    public void showInformation () {
        System.out.println(nome);
        System.out.printf("%d anos \n", idade);
        System.out.printf("Perfil de consumo: %s\n", perfil);
    }

    public void defProfileConsumption (double income, double costs) {

        if (income > 0 ) {
            double spendingPercentage = (costs / income) * 100;
            if (spendingPercentage < 30 ) {
                this.perfil = "baixo";
            }
            else if (spendingPercentage >= 30 && spendingPercentage <= 60) {
                this.perfil = "mediano";
            } else {
                this.perfil = "consumista";
            }} else {
            this.perfil = "indefinido";
        }
    }

}
