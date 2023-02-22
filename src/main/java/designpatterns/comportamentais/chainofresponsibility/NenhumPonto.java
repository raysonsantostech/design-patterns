package designpatterns.comportamentais.chainofresponsibility;

public class NenhumPonto implements CalculadorDePontos {

    @Override
    public int calcularPontos(Pedido pedido) {
        return 0;
    }

    @Override
    public void setProximo(CalculadorDePontos calculadorDePontos) {
    }

}
