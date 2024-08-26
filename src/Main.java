import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Criação de instâncias
        UserRegistration userRegistration = new UserRegistration();
        Login loginScreen = new Login(userRegistration);
        Scanner scanner = new Scanner(System.in);

        // Simulando o processo de cadastro
        System.out.println("=== Cadastro de Usuário ===");
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();

        // Cadastrando o usuário
        userRegistration.registerUser(username, password);

        // Simulando o processo de login
        System.out.println("\n=== Tela de Login ===");
        System.out.print("Digite o nome de usuário: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String loginPassword = scanner.nextLine();

        // Verificando as credenciais
        if (loginScreen.verifyCredentials(loginUsername, loginPassword)) {
            System.out.println("Login bem-sucedido! Acesso ao aplicativo liberado.");

            // VALIDAR PERFIL DE CONSUMO DO USUÁRIO
            PerfilConsumo profile = new PerfilConsumo();
            ItemFinanceiro item = new ItemFinanceiro();

            int idade = 0;
            boolean idadeValida = false;

            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();

            while (!idadeValida) {
                System.out.println("Digite a sua idade: ");
                if (sc.hasNextInt()) {
                    idade = sc.nextInt();
                    idadeValida = true;
                } else {
                    System.out.println("Idade inválida. Por favor, insira um número inteiro.");
                    sc.next(); // Limpa a entrada inválida
                }
            }

            System.out.println("Qual foi o seu salário do mês: ");
            double salario = sc.nextDouble();

            System.out.println("Qual foi o seu total de despesas do mês: ");
            double despesas = sc.nextDouble();

            profile.setPerfilCompleto(nome, idade, "");
            profile.defProfileConsumption(salario, despesas);

            profile.showInformation();


            System.out.println("\n");
            System.out.println("\n");

            System.out.println("Defina seu item financeiro");
            // Cadastrar Item
            String tipo = "";
            boolean tipoValido = false;

            // Solicita o tipo de transação até ser válido
            while (!tipoValido) {
                System.out.println("Digite 'Paguei' ou 'Recebi': ");
                tipo = sc.nextLine().trim();

                if (tipo.equalsIgnoreCase("Paguei") || tipo.equalsIgnoreCase("Recebi")) {
                    tipoValido = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, digite 'Paguei' ou 'Recebi'.");
                }
            }

            System.out.println("Digite o valor: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Valor inválido. Por favor, insira um número.");
                sc.next();
            }
            double valor = sc.nextDouble();
            sc.nextLine(); // Consome a nova linha deixada por nextDouble

            System.out.println("Digite a categoria: ");
            String categoria = sc.nextLine();

            System.out.println("\n");
            System.out.println("\n");

            // Cadastrar o item
            item.registerItem(tipo, valor, categoria);

            // Listar os itens cadastrados
            System.out.println("Itens cadastrados:");
            item.showItens();

            System.out.println("\n");
            System.out.println("\n");

            // Criando uma nova carteira de investimentos
            MinhaCarteira carteira = new MinhaCarteira();
            carteira.Produto("João", 1000.0, "Conservador");

            // Exibindo informações da carteira
            carteira.exibirInformacoes();

            // Comprando as ações
            carteira.comprar(2, 20);

            // Adicionando dinheiro à carteira
            carteira.adicionarSaldo(3, 200);
        } else {
            System.out.println("Login falhou. Verifique suas credenciais.");
        }
    }
}
