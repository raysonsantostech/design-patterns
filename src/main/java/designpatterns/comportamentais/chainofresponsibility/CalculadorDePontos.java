package designpatterns.comportamentais.chainofresponsibility;

public interface CalculadorDePontos {

    public int calcularPontos(Pedido pedido);

    public void setProximo(CalculadorDePontos calculadorDePontos);

}
