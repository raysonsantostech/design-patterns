package designpatterns.estruturais.adapter;

import designpatterns.estruturais.adapter.external.EduzzPagamento;

public class EduzzPagamentoAdapter implements Gateway {

  private EduzzPagamento eduzzPagamento;
  private String numeroCartao;
  private String cvv;

  public EduzzPagamentoAdapter(EduzzPagamento eduzzPagamento) {
    this.eduzzPagamento = eduzzPagamento;
  }

  @Override
  public void setValor(float valor) {
    this.eduzzPagamento.setValorTotal(valor);
  }

  @Override
  public void setParcelas(int parcelas) {
    this.eduzzPagamento.setNumeroDeParcelas(parcelas);
  }

  @Override
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;

    if (!this.cvv.isEmpty()) {
      this.eduzzPagamento.setNumeroCartao(this.numeroCartao, this.cvv);
    }
  }

  @Override
  public void setCvv(String cvv) {
    this.cvv = cvv;

    if (!this.numeroCartao.isEmpty()) {
      this.eduzzPagamento.setNumeroCartao(this.numeroCartao, this.cvv);
    }
  }

  @Override
  public boolean validarCartao() {
    return true;
  }

  @Override
  public boolean realizarPagamento() {
    return this.eduzzPagamento.realizarPagamento();
  }

}
