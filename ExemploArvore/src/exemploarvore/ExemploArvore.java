package exemploarvore;
import arvorebinaria.ABB;
public class ExemploArvore{

    public static void main(String[] args) {
        ABB arvore = new ABB();
        
        arvore.insere(10);
        arvore.insere(15);
        arvore.insere(2);
        arvore.insere(1);
        arvore.insere(20);
        arvore.insere(50);
        arvore.insere(5);
        arvore.insere(3);
        arvore.insere(6);
        
        arvore.removerElemento(1);
        arvore.printInOrdem();
    }

}