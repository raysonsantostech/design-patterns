package designpatterns.estruturais.composite;

public class GerenciadorDeArquivos {
    private Componente raiz;

    public GerenciadorDeArquivos(Componente raiz) {
        this.raiz = raiz;
    }

    public void exibirTodos() {
        this.raiz.exibir();
    }

    public void exibirCaminhoCompleto() {
        this.raiz.exibirCaminhoCompleto(this.raiz.getCaminho());
    }
}