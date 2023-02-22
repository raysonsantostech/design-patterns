package designpatterns.comportamentais.chainofresponsibility;

public class Pontos70Reais implements CalculadorDePontos {

    private CalculadorDePontos calculadorDePontos;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 70) {            
            return (int) pedido.getValor() / 5;
        }
        
        return this.calculadorDePontos.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorDePontos calculadorDePontos) {
        this.calculadorDePontos = calculadorDePontos;        
    }

}
