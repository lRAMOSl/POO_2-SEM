package br.com.alpha.projeto_alpha1.view;

abstract class Pessoa {

    String nome, cpf, rg;

    public abstract String retornaDados();

    public abstract String retornaDados2();

    public abstract String retornaDados3();

    public void retornaDadosTeste() {

        System.out.println("Metodo nao abstrato");

    }
}
