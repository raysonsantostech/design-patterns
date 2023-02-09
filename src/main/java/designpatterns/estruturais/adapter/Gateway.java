package designpatterns.estruturais.adapter;

public interface Gateway {

  public void setValor(float valor);

  public void setParcelas(int parcelas);

  public void setNumeroCartao(String numeroCartao);

  public void setCvv(String cvv);

  public boolean validarCartao();

  public boolean realizarPagamento();

}
