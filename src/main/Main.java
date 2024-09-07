package main;

import wallet.*;
import user.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de usuários
        BasicUserRegistration basicUserRegistration = new BasicUserRegistration();

        // Solicita informações para o cadastro
        System.out.println("=== Cadastro de Usuário ===");
        System.out.print("Nome de Usuário: ");
        String username = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        // Registra o usuário
        basicUserRegistration.registerUser(username, password);

        // Solicita o login do usuário
        System.out.println("\n=== Login ===");
        System.out.print("Nome de Usuário: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Senha: ");
        String loginPassword = scanner.nextLine();

        // Fazendo login como usuário básico
        Login login = new Login(basicUserRegistration);
        if (login.verifyCredentials(loginUsername, loginPassword)) {
            System.out.println("Login bem-sucedido!");

            // Criando a carteira do usuário
            System.out.print("\nDigite o seu nome para a carteira: ");
            String nomeCarteira = scanner.nextLine();
            MinhaCarteira carteira = new MinhaCarteira(nomeCarteira);

            // Adicionando perfil de consumo
            System.out.println("\n=== Informações Financeiras ===");
            System.out.print("Digite o valor do seu salário: R$ ");
            double salario = scanner.nextDouble();
            System.out.print("Digite o valor das suas despesas: R$ ");
            double despesas = scanner.nextDouble();
            PerfilConsumo perfilConsumo = new PerfilConsumo(salario, despesas);
            perfilConsumo.exibirPerfil();

            // Adicionando itens financeiros
            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar Investimento");
                System.out.println("2. Adicionar Despesa");
                System.out.println("3. Exibir Carteira");
                System.out.println("4. Exibir Perfil de Consumo");
                System.out.println("5. Sair");
                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner

                if (opcao == 1) {
                    // Adicionar Investimento
                    System.out.print("Valor do Investimento: ");
                    double valorInvestimento = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Categoria do Investimento: ");
                    String categoriaInvestimento = scanner.nextLine();

                    ItemFinanceiro investimento = new Investimento(valorInvestimento, categoriaInvestimento);
                    carteira.adicionarItemFinanceiro(investimento);

                } else if (opcao == 2) {
                    // Adicionar Despesa
                    System.out.print("Valor da Despesa: ");
                    double valorDespesa = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Categoria da Despesa: ");
                    String categoriaDespesa = scanner.nextLine();

                    ItemFinanceiro despesa = new Despesa(valorDespesa, categoriaDespesa);
                    carteira.adicionarItemFinanceiro(despesa);

                } else if (opcao == 3) {
                    // Exibir Carteira
                    carteira.exibirCarteira();

                } else if (opcao == 4) {
                    // Exibir Perfil de Consumo
                    perfilConsumo.exibirPerfil();

                } else if (opcao == 5) {
                    // Sair do loop
                    System.out.println("Saindo...");
                    break;

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } else {
            System.out.println("Falha no login.");
        }

        scanner.close();
    }
}
