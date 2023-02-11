package designpatterns.estruturais.facade.vendas;

public class EmailPedido {

  private Pedido pedido;

  public EmailPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public void enviarEmail(String mensagem) {
    System.out.println("Enviando para: " + this.pedido.getConsumidor().getEmail());
    System.out.println("Mensagem: " + mensagem);
    System.out.println();

  }

}
