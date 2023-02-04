package designpatterns.comportamentais.state;

public class AguardandoPagamento implements State {

  private Pedido pedido;

  public AguardandoPagamento(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public void sucessoAoPagar() {
    this.pedido.setAtual(pedido.getPago());
  }

  @Override
  public void despacharPedido() {
    System.err.println("Pedido não pode ser despachado, aguardando pagamento.");
  }

  @Override
  public void cancelarPedido() {
    this.pedido.setAtual(pedido.getCancelado());
  }

}
