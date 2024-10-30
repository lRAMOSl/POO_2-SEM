package arvorebinaria;

public class ABB {

    private No raiz;

    public ABB() {
        this.raiz = null;

    }

    public void insere(double valor) {
        if (this.raiz == null) {
            No aux = new No(valor);
            this.raiz = aux;
        } else {

            No temp = this.raiz;

            do {
                if (valor > temp.getValor() && (temp.getDireita() == null)) {
                    No aux = new No(valor);
                    temp.setDireita(aux);
                    temp = temp.getDireita().getDireita();
                } else if ((valor) < temp.getValor() && (temp.getEsquerda() == null)) {
                    No aux = new No(valor);
                    temp.setEsquerda(aux);
                    temp = temp.getEsquerda().getEsquerda();
                } else if ((valor > temp.getValor()) && (temp.getDireita() != null)) {
                    temp = temp.getDireita();
                } else if ((valor < temp.getValor()) && (temp.getEsquerda() != null)) {
                    temp = temp.getEsquerda();
                } else if ((valor < temp.getValor()) && temp.getDireita() != null) {
                    temp = temp.getDireita();
                }

            } while (temp != null);
        }

    }

    public void printInOrdem() {
        execInOrdem(this.raiz);
    }

    private void execInOrdem(No aux) {
        if (aux != null) {
            execInOrdem(aux.getEsquerda());
        }
        if (aux != null) {
            System.out.println(aux.getValor());
        }
        if (aux != null) {
            execInOrdem(aux.getDireita());
        }

    }

    public void removerElemento(double valor) {

        No atual = this.raiz;
        No paiAtual = null;

        while (atual != null && atual.getValor() != valor) {
            if (atual.getValor() == valor) {
                return;
            } else if (valor < atual.getValor()) {
                paiAtual = atual;
                atual = atual.getEsquerda();
            } else {
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }

        if (atual != null) {
            // Caso 0
            if (atual.getDireita() == null && atual.getEsquerda() == null) {
                if (atual.getValor() < paiAtual.getValor()) {
                    paiAtual.setEsquerda(null);
                } else {
                    paiAtual.setDireita(null);
                }

                // Caso 1 a esquerda
            } else if (atual.getEsquerda() != null) {
                No subistituto = atual.getEsquerda();
                No paiSubistituto = atual;
                while (subistituto.getDireita() != null) {
                    paiSubistituto = subistituto;
                    subistituto = subistituto.getDireita();
                }
                if (atual.getValor() < paiAtual.getValor()) {
                    paiAtual.setEsquerda(subistituto);
                } else {
                    paiAtual.setDireita(subistituto);
                }

                // Caso 1 a direita
            } else if (atual.getDireita() != null) {
                No subistituto = atual.getDireita();
                No paiSubistituto = atual;
                while (subistituto.getEsquerda() != null) {
                    paiSubistituto = subistituto;
                    subistituto = subistituto.getEsquerda();
                }
                if (atual.getValor() < paiAtual.getValor()) {
                    paiAtual.setEsquerda(subistituto);
                } else {
                    paiAtual.setDireita(subistituto);
                }

            }

        }
    }
}
