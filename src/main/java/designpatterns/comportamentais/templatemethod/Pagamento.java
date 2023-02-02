package designpatterns.comportamentais.templatemethod;

public abstract class Pagamento {
  protected float valor;
  private Gateway gateway;

  public Pagamento(Gateway gateway, float valor) {
    this.gateway = gateway;
    this.valor = valor;
  }

  abstract float calcularDesconto();

  float calcularTaxa() {
    return 0;
  }

  public void realizarCobranca() {
    float valorFinal = this.valor + this.calcularTaxa() - this.calcularDesconto();
    System.out.println("Cálculo: " + this.valor + " + " + this.calcularTaxa() + " - " + this.calcularDesconto());
    this.gateway.cobrar(valorFinal);
  }

}
