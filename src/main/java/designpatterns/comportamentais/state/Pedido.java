package designpatterns.comportamentais.state;

public class Pedido {

  private State aguardandoPagamento;
  private State pago;
  private State despachado;
  private State cancelado;
  private State enviado;

  private State stateAtual;

  public Pedido() {
    this.aguardandoPagamento = new AguardandoPagamento(this);
    this.pago = new Pago(this);
    this.despachado = new Despachado(this);
    this.cancelado = new Cancelado(this);
    this.enviado = new Enviado(this);

    this.stateAtual = aguardandoPagamento;
  }

  public void realizarPagamento() {
    this.stateAtual.sucessoAoPagar();
  }

  public void cancelarPedido() {
    this.stateAtual.cancelarPedido();
  }

  public void despacharPedido() {
    this.stateAtual.despacharPedido();
  }

  public void setAtual(State stateAtual) {
    this.stateAtual = stateAtual;
  }

  public State getAguardandoPagamento() {
    return aguardandoPagamento;
  }

  public State getPago() {
    return pago;
  }

  public State getDespachado() {
    return despachado;
  }

  public State getCancelado() {
    return cancelado;
  }

  public State getEnviado() {
    return enviado;
  }

}
