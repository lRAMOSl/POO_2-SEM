package br.com.alpha.prj1;

import java.util.Scanner;

public class AplicacaoPessoaEndereco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Endereco end = new Endereco();
        char resp;

        System.out.println("Informe o nome: ");
        p1.setNome(sc.nextLine());

        System.out.println("Digite a idade: ");
        p1.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("Informe o sexo(f/m): ");
        p1.setSexo(sc.next().charAt(0));
        sc.nextLine();

        System.out.println("Informe o logradouro: ");
        end.setLogradouro(sc.nextLine());

        System.out.println("Digite o numero: ");
        end.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.println("Tem complemento? [s/n]");
        resp = sc.next().charAt(0);

        if ((resp == 's') || (resp == 's')) {
            sc.nextLine();
            System.out.println("Informe o complemento: ");
            end.setComplemento(sc.nextLine());

        } else {
            end.setComplemento("");
        }
        System.out.println("Digite o CEP: ");
        end.setCep(sc.nextLine());

        p1.setEnd(end);

        System.out.println("\n\t\t - Dados da pessoa: -\n\n" + p1.imprimirPessoa());

        sc.close();

    }

}
