package designpatterns.comportamentais.templatemethod;

public class PagamentoCredito extends Pagamento {

  public PagamentoCredito(Gateway gateway, float valor) {
    super(gateway, valor);
  }

  @Override
  float calcularTaxa() {
    return this.valor * 0.05f;
  }

  @Override
  float calcularDesconto() {
    if (this.valor > 300f) {
      return this.valor * 0.02f;
    }

    return 0;
  }

}
