package designpatterns.comportamentais.chainofresponsibility;

public class Pontos40Reais implements CalculadorDePontos {

    private CalculadorDePontos calculadorDePontos;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 40) {            
            return (int) pedido.getValor() / 7;
        }
        
        return this.calculadorDePontos.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorDePontos calculadorDePontos) {
        this.calculadorDePontos = calculadorDePontos;        
    }

}
