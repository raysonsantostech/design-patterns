package designpatterns.comportamentais.templatemethod;

public class PagamentoDinheiro extends Pagamento {

  public PagamentoDinheiro(Gateway gateway, float valor) {
    super(gateway, valor);
  }

  @Override
  float calcularDesconto() {
    return this.valor * 0.1f;
  }

}
