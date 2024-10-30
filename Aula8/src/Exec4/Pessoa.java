package Exec4;

abstract class Pessoa{
    String nome,cpf,rg,dataMatricula, dataAdmissao, curso;
    int registroDoAluno, registroDoFuncionario;
    float notaVestibular;
    
    public abstract String retornaDados();
}