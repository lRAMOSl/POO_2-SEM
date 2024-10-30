package Exec4;

class Funcionario extends Pessoa{

    public Funcionario(){}
    
        @Override
        public String retornaDados(){
        
        String dados = "";
        
        dados+="Nome: " + nome + "\n";
        dados+="RG: " + rg + "\n";
        dados+="CPF: " + cpf + "\n";
        dados+="Registro do Funcionario: " + registroDoFuncionario + "\n";
        dados+="Data da Contratacao: " + dataAdmissao + "\n";
        
        
        return dados;
    }
        
    
    

} 