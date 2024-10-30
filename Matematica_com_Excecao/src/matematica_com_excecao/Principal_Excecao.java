package matematica_com_excecao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal_Excecao {
    
    public static void main(String[] args) {
        int x,y,resultado;
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Informe o 1º valor: ");
            x = sc.nextInt();
            System.out.println("Informe o 2º valor: ");
            y = sc.nextInt();
            resultado = x / y;
            System.out.println("O resultado da divisão é: " + resultado);
        }catch (ArithmeticException AE){
            System.out.println("Não existe divisão por zero (0)!");
        }catch(InputMismatchException IME){
            System.out.println("Valor informado não é um nº inteiro!");
        }
        
        System.out.println("O programa agora pode continuar...");
    }
    
}
