package designpatterns.estruturais.facade.vendas;

import designpatterns.estruturais.facade.Consumidor;
import designpatterns.estruturais.facade.Produto;

public class VendaFacede {

  private Pedido pedido;
  private EmailPedido emailPedido;
  private Pagamento pagamento;

  public VendaFacede(Consumidor consumidor) {
    this.pedido = new Pedido(consumidor);
    this.emailPedido = new EmailPedido(this.pedido);
  }

  public void addProduto(Produto produto) {
    this.pedido.addProduto(produto);
  }

  public void pagarPorCredito() {
    this.pagamento = new PagamentoCredito(this.pedido);

    if (this.pagamento.realizarPagemento()) {
      this.emailPedido.enviarEmail("Pedido Realizado com sucesso!");
    } else {
      this.emailPedido.enviarEmail("Não foi possível realizar o Pedido.");
    }
  }

  public void pagarPorBoleto() {
    this.pagamento = new PagamentoBoleto(this.pedido);

    if (this.pagamento.realizarPagemento()) {
      this.emailPedido.enviarEmail("Pedido realizado com sucesso!");
    } else {
      this.emailPedido.enviarEmail("Não foi possível realizar o Pedido.");
    }
  }

}
