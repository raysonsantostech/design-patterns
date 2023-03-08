package designpatterns.estruturais.composite;

public abstract class Componente {

    public String getNome() {
        throw new UnsupportedOperationException("Opereção não suportada.");
    }

    public String getCaminho() {
        throw new UnsupportedOperationException("Opereção não suportada.");
    }

    public void exibir() {
        throw new UnsupportedOperationException("Opereção não suportada.");
    }

    public void adicionar(Componente componente) {
        throw new UnsupportedOperationException("Opereção não suportada.");
    }

    public void remover(Componente componente) {
        throw new UnsupportedOperationException("Opereção não suportada.");
    }

    public Componente getFilho(int indice) {
        throw new UnsupportedOperationException("Opereção não suportada.");
    }

    public void exibirCaminhoCompleto(String caminhoAnterior) {
    }
}
