package br.com.alpha.projeto_alpha1.view;

class Aluno extends Pessoa {

    public Aluno() {

    }

    @Override
    public String retornaDados() {
        String dados = "";

        dados += "Nome " + nome + "\n";
        dados += "Cpf " + cpf + "\n";
        dados += "Rg " + rg + "\n";

        return dados;
    }

    @Override
    public String retornaDados2() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String retornaDados3() {
        throw new UnsupportedOperationException();
    }

}
