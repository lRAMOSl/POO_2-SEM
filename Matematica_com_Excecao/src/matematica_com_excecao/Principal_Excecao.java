package matematica_com_excecao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal_Excecao {
    
    public static void main(String[] args) {
        int x,y,resultado;
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Informe o 1� valor: ");
            x = sc.nextInt();
            System.out.println("Informe o 2� valor: ");
            y = sc.nextInt();
            resultado = x / y;
            System.out.println("O resultado da divis�o �: " + resultado);
        }catch (ArithmeticException AE){
            System.out.println("N�o existe divis�o por zero (0)!");
        }catch(InputMismatchException IME){
            System.out.println("Valor informado n�o � um n� inteiro!");
        }
        
        System.out.println("O programa agora pode continuar...");
    }
    
}
