package designpatterns.comportamentais.chainofresponsibility;


public class Cliente {
    public static void main(String[] args) {

        CalculadoraDePontos calculadoraDePontos = new CalculadoraDePontos();

        Pedido pedido1 = new Pedido(21f);
        System.out.println("Dia 15: " + calculadoraDePontos.calcularPontos(pedido1, 15) + " pontos");
        System.out.println("Dia 16: " + calculadoraDePontos.calcularPontos(pedido1, 16) + " pontos");

        Pedido pedido2 = new Pedido(100f);
        System.out.println("Dia 15: " + calculadoraDePontos.calcularPontos(pedido2, 15) + " pontos");
        System.out.println("Dia 16: " + calculadoraDePontos.calcularPontos(pedido2, 16) + " pontos");

    }
}
