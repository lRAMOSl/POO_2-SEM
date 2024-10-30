package exemplo_throws;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal_Throws {

   
    public static void main(String[] args) {
     
        Scanner ler = new Scanner(System.in);
        
        try{
        
            System.out.println("Informe o primeiro valor: ");
            int n1 = ler.nextInt();
            System.out.println("Informe o segundo valor: ");
            int n2 = ler.nextInt();
            
            Calculo_Excecao excep1 = new Calculo_Excecao();
            excep1.calcularNumeros(n1, n2);
        }catch(ArithmeticException ae){
            System.out.println("Não existe divisão por 0\n " + ae);
        }catch(InputMismatchException ime){
            System.out.println("Valor informado não é um número\n" + ime);
    }
    }
    
}
