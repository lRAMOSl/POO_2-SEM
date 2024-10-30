package heranca;

public class Professor extends Pessoa {
   
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    
    public String retornaDadosProfessor(){
        String dados;
        
        dados = super.retornaDados();
        
        dados += "ID.: " + matriculaProfessor + "\n";
        dados += "Data Admissão.: " + dataAdmissao + "\n";
        dados += "Salário por hora.: " + salarioHorista + "\n";
        
        return dados;
        
    }
}
