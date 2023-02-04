package designpatterns.comportamentais.state;

public class Enviado implements State {

  private Pedido pedido;

  public Enviado(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public void sucessoAoPagar() {
    System.err.println("Pedido enviado não pode ser pago.");
  }

  @Override
  public void despacharPedido() {
    System.err.println("Pedido enviado não pode ser despachado.");
  }

  @Override
  public void cancelarPedido() {
    System.err.println("Pedido enviado não pode ser cancelado.");
  }

}
