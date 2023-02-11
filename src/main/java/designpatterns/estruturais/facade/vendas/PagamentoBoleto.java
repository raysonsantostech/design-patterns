package designpatterns.estruturais.facade.vendas;

public class PagamentoBoleto extends Pagamento {

  public PagamentoBoleto(Pedido pedido) {
    super(pedido);
  }

  @Override
  public boolean realizarPagemento() {
    System.out.println("Pagamento por Boleto");
    System.out.println("Valor total: " + this.pedido.getValor());
    System.out.println();
    return true;
  }

}
