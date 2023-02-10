package designpatterns.estruturais.decorator;

public class PizzaQuatroQueijos extends Pizza {

  public PizzaQuatroQueijos() {
    super.descricao = "Quatro queijos";
    super.preco = 39;
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
