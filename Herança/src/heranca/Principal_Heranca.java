package heranca;
import java.util.Scanner;

public class Principal_Heranca {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        a1.nome = sc.nextLine();
        System.out.println("Digite o RG do aluno: ");
        a1.rg = sc.nextLine();
        
        a1.nome = "Gustavo Ramos Santos";
        a1.rg = "34.456.432-1";
        a1.cpf = "450.253.124-24";
        a1.registroAluno = 2454123;
        a1.notaVestibular = 8.8f;
        a1.curso = "Bacharel em Sistema da Informação";
        a1.dataMatricula = "14/05/2022";
        
        p1.nome = "Alexandre Frota";
        p1.rg = "34.584.278-7";
        p1.cpf = "467.578.432-87";
        p1.matriculaProfessor = 12456;
        p1.dataAdmissao = "10/09/2023";
        p1.salarioHorista = 100.90;
        
        System.out.println("\t - Dados do Aluno RA nº: " + a1.registroAluno + "-\n");
        System.out.println(a1.retornaDadosAluno());
        System.out.println(p1.retornaDadosProfessor());
    }
    
}
