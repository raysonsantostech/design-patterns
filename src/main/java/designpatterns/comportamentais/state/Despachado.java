package designpatterns.comportamentais.state;

public class Despachado implements State {

  private Pedido pedido;

  public Despachado(Pedido pedido) {
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
    System.err.println("Pedido já foi despachado, não pode ser cancelado.");
  }

}
