package designpatterns.comportamentais.state;

public class Cancelado implements State {

  private Pedido pedido;

  public Cancelado(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public void sucessoAoPagar() {
    System.err.println("Pedido cancelado não pode ser pago.");
  }

  @Override
  public void despacharPedido() {
    System.err.println("Pedido cancelado não pode ser despachado.");
  }

  @Override
  public void cancelarPedido() {
    System.err.println("Pedido já foi cancelado.");
  }

}
