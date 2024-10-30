package exemplo_interface2;
import java.util.Scanner;

public class Principal_Interface{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeAux;
        double salarioAux;
        int diasAux;
    
        System.out.println("Informe o nome do funcionário mensalista: ");
        nomeAux = sc.nextLine();
        System.out.println("Entre com o salário bruto do mensalista: ");
        salarioAux = sc.nextDouble();
        
        FuncionarioMensalista fm = new FuncionarioMensalista(nomeAux, salarioAux);
        
        sc.nextLine();
        
        System.out.println("\nInforme o nome do funcionário diarista: ");
        nomeAux = sc.nextLine();
        System.out.println("Qual o valor da hora do funcionário diarista: ");
        salarioAux = sc.nextDouble();
        System.out.println("Quantos dias ele trabalhou?");
        diasAux = sc.nextInt();
        
        FuncionarioDiarista fd = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
        
        System.out.println("\n\t\t - Dados e salário do funcionário mensalista - ");
        System.out.println("\tNome..: " + fm.nome);
        System.out.println("\tSalário Bruto.: " + fm.calcularSalarioLiquido());
        
        System.out.println("\n\t\t - Dados e salário do funcionário Diarista - ");
        System.out.println("\tNome..:" + fd.nome);
        System.out.println("\tSalário Bruto.: " + fd.calcularSalarioLiquido());
    
    }

}