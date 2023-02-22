package designpatterns.comportamentais.chainofresponsibility;

public class Pedido {

    private float valor;

    public Pedido(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
