package designpatterns.estruturais.adapter;

public class Cobranca {

  private Gateway gateway;

  private float valor;
  private int parcelas;
  private String numeroCartao;
  private String cvv;

  public Cobranca(Gateway gateway) {
    this.gateway = gateway;
  }

  public Gateway getGateway() {
    return gateway;
  }

  public void setGateway(Gateway gateway) {
    this.gateway = gateway;
  }

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.gateway.setValor(valor);
    this.valor = valor;
  }

  public int getParcelas() {
    return parcelas;
  }

  public void setParcelas(int parcelas) {
    this.gateway.setParcelas(parcelas);
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.gateway.setNumeroCartao(numeroCartao);
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.gateway.setCvv(cvv);
  }

  public boolean validarCartao() {
    return true;
  }

  public void realizarPagamento() {
    if (this.gateway.validarCartao()) {
      this.gateway.realizarPagamento();
    }
  }

}
