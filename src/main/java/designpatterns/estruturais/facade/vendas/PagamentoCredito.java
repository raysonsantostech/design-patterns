package designpatterns.estruturais.facade.vendas;

public class PagamentoCredito extends Pagamento {

  public PagamentoCredito(Pedido pedido) {
    super(pedido);
  }

  @Override
  public boolean realizarPagemento() {
    System.out.println("Pagamento por Cartão de Crédito");
    System.out.println("Valor total: " + this.pedido.getValor());
    System.out.println();
    return false;
  }

}
