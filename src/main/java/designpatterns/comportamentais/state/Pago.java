package designpatterns.comportamentais.state;

public class Pago implements State {

  private Pedido pedido;

  public Pago(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public void sucessoAoPagar() {
    System.err.println("Pedido já foi pago.");
  }

  @Override
  public void despacharPedido() {
    this.pedido.setAtual(this.pedido.getEnviado());
  }

  @Override
  public void cancelarPedido() {
    this.pedido.setAtual(this.pedido.getCancelado());
  }

}
