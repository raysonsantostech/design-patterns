package designpatterns.estruturais.adapter.external;

public class HotmartPagamento {

  private float valor;
  private int parcelas;
  private String numeroCartao;
  private String cvv;

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public int getParcelas() {
    return parcelas;
  }

  public void setParcelas(int parcelas) {
    this.parcelas = parcelas;
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public boolean validarCartao() {
    return true;
  }

  public boolean realizarPagamento() {
    System.out.println("Pagamento via HotmartPagamento.");
    return true;
  }

}
