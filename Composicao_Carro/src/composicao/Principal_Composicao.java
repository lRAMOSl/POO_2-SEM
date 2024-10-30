package composicao;

import java.util.Scanner;

public class Principal_Composicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        int resp;
        do{
        
        System.out.println("Qual acao deseja fazer: \n [1] Cadastrar \n [2] Exibir \n [3] Sair");
        resp = sc.nextInt();
        sc.nextLine();

        
            switch (resp) {

                case 1:
                    System.out.println("Digite a marca do carro: ");
                    carro.setMarca(sc.nextLine());
                    System.out.println("Digite a modelo do carro: ");
                    carro.setModelo(sc.nextLine());
                    System.out.println("Digite a placa: ");
                    carro.setPlaca(sc.nextLine());
                    System.out.println("Digite o ano do carro: ");
                    carro.setAno(sc.nextInt());
                    System.out.println("Digite a velocidade maxima do carro: ");
                    carro.setQuantidade(sc.nextInt());
                    System.out.println("Digite o peso do carro: ");
                    carro.setPeso(sc.nextFloat());
                    System.out.println("Digite a quantidade desse modelo");
                    carro.setQuantidade(sc.nextInt());
                    break;

                case 2:
                    carro.imprimir();
                    break;
                    
                    

            }

            

        }while(resp != 3);
        

    }
    
}
