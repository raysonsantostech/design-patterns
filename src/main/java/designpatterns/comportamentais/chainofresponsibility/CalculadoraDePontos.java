package designpatterns.comportamentais.chainofresponsibility;

public class CalculadoraDePontos {

    public float calcularPontos(Pedido pedido, int dia) {

        CalculadorDePontos pontos70Reais = new Pontos70Reais();
        CalculadorDePontos pontos40Reais = new Pontos40Reais();
        CalculadorDePontos pontos20Reais = new Pontos20Reais();
        CalculadorDePontos nenhumPonto = new NenhumPonto();

        pontos70Reais.setProximo(pontos40Reais);
        pontos40Reais.setProximo(pontos20Reais);
        pontos20Reais.setProximo(nenhumPonto);

        if(dia >= 16 && dia <= 31) {
            return pontos70Reais.calcularPontos(pedido) * 2;
        }

        return pontos70Reais.calcularPontos(pedido);
    }


}
