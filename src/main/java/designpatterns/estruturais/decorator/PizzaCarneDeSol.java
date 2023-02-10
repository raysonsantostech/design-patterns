package designpatterns.estruturais.decorator;

public class PizzaCarneDeSol extends Pizza {

  public PizzaCarneDeSol() {
    super.descricao = "Carne de Sol";
    super.preco = 45;
  }

  @Override
  public String getDescricao() {
    return descricao;
  }

  @Override
  public float getPreco() {
    return preco;
  }

}
