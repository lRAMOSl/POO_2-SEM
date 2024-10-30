package Principal;

// ADO 2
// Alunos;
// Borys Ever Tito Calderon
// Gustavo Ramos Santos

import Holerite.*;
import Funcionario.Funcionario;
import java.util.Scanner;

public class Main {

    private static Funcionario[] funcionarios = new Funcionario[100];
    private static int numFuncionarios = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    perguntarContinuar();
                    break;
                case 2:
                    verHolerite();
                    perguntarContinuar();
                    break;
                case 0:
                    System.out.println("\n=========================================");
                    System.out.println("|      Encerrando a aplicação.        |");
                    System.out.println("|       Obrigado por usar o sistema!   |");
                    System.out.println("=========================================");
                    System.exit(0);
                default:
                    System.out.println("|Opção inválida. Tente novamente.|");
            }
        } while (true);
    }

    private static void perguntarContinuar() {
        System.out.print("|Deseja continuar? (s/n): ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("n")) {
            System.out.println("\n=========================================");
                    System.out.println("|      Encerrando a aplicação.       |");
                    System.out.println("|       Obrigado por usar o sistema!   |");
                    System.out.println("=========================================");
                    System.exit(0);
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=========================================");
        System.out.println("|          Menu de Opções              |");
        System.out.println("=========================================");
        System.out.println("|1. Cadastrar Funcionário\t\t|");
        System.out.println("|2. Ver Holerite\t\t\t|");
        System.out.println("|0. Sair\t\t\t\t|");
        System.out.print("|Escolha uma opção:");
    }

    private static void cadastrarFuncionario() {
        if (numFuncionarios >= funcionarios.length) {
            System.out.println("Limite de funcionários atingido.");
            return;
        }

        System.out.println("\n=========================================");
        System.out.println("|       Cadastrar Funcionário\t\t|");
        System.out.println("=========================================");

        boolean continuar = true;
        while (continuar) {
            System.out.print("|Digite o nome do funcionário:");
            String nome = sc.nextLine();

            System.out.print("|Digite o salário do funcionário: ");
            double salario = sc.nextDouble();

            System.out.print("|Digite as horas extras: ");
            double horasExtras = sc.nextDouble();

            System.out.print("|Digite o bônus: ");
            double bonus = sc.nextDouble();

            System.out.print("|Utiliza vale transporte? (true/false): ");
            boolean utilizaValeTransporte = sc.nextBoolean();
            sc.nextLine();

            funcionarios[numFuncionarios++] = new Funcionario(nome, salario, horasExtras, bonus, utilizaValeTransporte);
            System.out.println("|Funcionário cadastrado com sucesso!");

            System.out.print("|Deseja cadastrar outro funcionário? (true/false): ");
            continuar = sc.nextBoolean();
            sc.nextLine();
        }
    }

    private static void verHolerite() {
        if (numFuncionarios == 0) {
            System.out.println("|Nenhum funcionário cadastrado.");
            return;
        }

        for (int i = 0; i < numFuncionarios; i++) {
            Funcionario funcionario = funcionarios[i];
            HoleriteDetalhado holerite = FolhaPagamento.calcularHolerite(funcionario);

            System.out.println("\n=========================================");
            System.out.println("|        Holerite de " + funcionario.getNome() + "\t\t|");
            System.out.println("=========================================");
            System.out.println("|               Ganhos                  |");
            System.out.println("=========================================");
            System.out.printf("|Salário Base:              R$ %.2f%n", holerite.salarioBase, "\t|");
            System.out.printf("|Horas Extras:             R$ %.2f%n", holerite.horasExtras, "\t|");
            System.out.printf("|Bônus:                    R$ %.2f%n", holerite.bonus, "\t|");
            System.out.printf("|Ganhos Totais:            R$ %.2f%n", holerite.ganhosTotais, "\t|");
            System.out.println("=========================================");
            System.out.println("|               Descontos               |");
            System.out.println("=========================================");
            System.out.printf("|Desconto INSS:            R$ %.2f%n", holerite.descontoINSS, "\t|");
            System.out.printf("|Desconto IRPF:            R$ %.2f%n", holerite.descontoIRPF, "\t|");
            System.out.printf("|Desconto Vale Transporte:  R$ %.2f%n", holerite.descontoValeTransporte, "\t|");
            System.out.printf("|Desconto Vale Refeição:    R$ %.2f%n", holerite.descontoValeRefeicao, "\t|");
            System.out.printf("|Desconto Convênio Médico:  R$ %.2f%n", holerite.descontoConvenioMedico, "\t|");
            System.out.printf("|Desconto Vale Alimentação:  R$ %.2f%n", holerite.descontoValeAlimentacao, "\t|");
            System.out.println("=========================================");
            System.out.printf("|Total de Descontos:        R$ %.2f%n", holerite.totalDescontos, "\t|");
            System.out.println("=========================================");
            System.out.printf("|Salário Líquido:           R$ %.2f%n", holerite.salarioLiquido, "\t|");
            System.out.println("=========================================");
        }

    }
}
