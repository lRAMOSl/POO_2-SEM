package teste;
import java.util.Scanner;
public class Principal_Debug  {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int n1 = sc.nextInt();
        
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();
        
        Calculo calc = new Calculo();
        
        System.out.printf("\n A soma de %d e %d é: %d \n", n1, n2, calc.somarNumeros(n1, n2));
        
        
       
    }
    
}
