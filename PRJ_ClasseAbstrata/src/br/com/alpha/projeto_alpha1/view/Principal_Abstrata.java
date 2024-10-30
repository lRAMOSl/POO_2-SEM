package br.com.alpha.projeto_alpha1.view;

public class Principal_Abstrata {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "Gustavo Ramos";
        a1.cpf = "567.543.574-23";
        a1.rg = "23.453.346-2";

        System.out.println("\t - Dados do Aluno: " + a1.nome + "-\n");
        System.out.println(a1.retornaDados());
    }
}
