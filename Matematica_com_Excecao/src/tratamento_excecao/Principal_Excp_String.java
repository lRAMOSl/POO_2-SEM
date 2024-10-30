package tratamento_excecao;


public class Principal_Excp_String {
    
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        
        
        try{
           novaFrase = frase.toLowerCase();
        } catch(NullPointerException e){
            
            System.out.println("""
                               A frase inicial contém um valor nulo.
                               Para sulocionar o problema foi atribuido um valor padrão
                              """);
            
            frase = "Frase Vazia";
            novaFrase = frase.toLowerCase();
        }
        
        
    
        System.out.println("Frase antiga: " + frase);
        System.out.println("Nova frase: " + novaFrase);
    }
    
    
}
