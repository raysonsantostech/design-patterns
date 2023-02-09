package designpatterns.estruturais.adapter.external;

public class EduzzPagamento {

  private float valorTotal;
  private int numeroDeParcelas;
  private String numeroCartao;
  private String cvv;

  public float getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(float valorTotal) {
    this.valorTotal = valorTotal;
  }

  public int getNumeroDeParcelas() {
    return numeroDeParcelas;
  }

  public void setNumeroDeParcelas(int numeroDeParcelas) {
    this.numeroDeParcelas = numeroDeParcelas;
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public String getCvv() {
    return cvv;
  }

  public void setNumeroCartao(String numeroCartao, String cvv) {
    this.numeroCartao = numeroCartao;
    this.cvv = cvv;
  }

  public boolean realizarPagamento() {
    System.out.println("Pagamento via EduzzPagamento.");
    return true;
  }

}