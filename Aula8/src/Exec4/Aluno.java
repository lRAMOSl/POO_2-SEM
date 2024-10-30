package Exec4;

class Aluno extends Pessoa{

    public Aluno(){}
    
    @Override
    public String retornaDados(){
        
        String dados = "";
        
        dados+="Nome: " + nome + "\n";
        dados+="RG: " + rg + "\n";
        dados+="CPF: " + cpf + "\n";
        dados+="Registro do Aluno: " + registroDoAluno + "\n";
        dados+="Data da Matricula: " + dataMatricula + "\n";
        dados+="Nota do Vestibular: " + notaVestibular + "\n";
        dados+="Curso do Aluno: " + curso + "\n";
        
        return dados;
    
    }
}