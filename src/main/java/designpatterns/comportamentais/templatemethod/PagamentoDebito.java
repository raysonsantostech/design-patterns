package designpatterns.comportamentais.templatemethod;

public class PagamentoDebito extends Pagamento {

  public PagamentoDebito(Gateway gateway, float valor) {
    super(gateway, valor);
  }

  @Override
  float calcularTaxa() {
    return 4;
  }

  @Override
  float calcularDesconto() {
    return this.valor * 0.05f;
  }

}
