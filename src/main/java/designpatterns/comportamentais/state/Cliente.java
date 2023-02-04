package designpatterns.comportamentais.state;

public class Cliente {

  public static void main(String[] args) {
    Pedido pedido = new Pedido();

    pedido.realizarPagamento();
    pedido.despacharPedido();

    pedido.realizarPagamento();
    pedido.despacharPedido();
    pedido.cancelarPedido();

  }

}
