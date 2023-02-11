package designpatterns.estruturais.facade.vendas;

public abstract class Pagamento {

  protected Pedido pedido;

  public Pagamento(Pedido pedido) {
    this.pedido = pedido;
  }

  public abstract boolean realizarPagemento();

}
