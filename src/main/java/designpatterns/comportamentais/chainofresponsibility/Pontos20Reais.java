package designpatterns.comportamentais.chainofresponsibility;

public class Pontos20Reais implements CalculadorDePontos {

    private CalculadorDePontos calculadorDePontos;

    @Override
    public int calcularPontos(Pedido pedido) {
        if (pedido.getValor() >= 20) {            
            return (int) pedido.getValor() / 10;
        }
        
        return this.calculadorDePontos.calcularPontos(pedido);
    }

    @Override
    public void setProximo(CalculadorDePontos calculadorDePontos) {
        this.calculadorDePontos = calculadorDePontos;        
    }

}
