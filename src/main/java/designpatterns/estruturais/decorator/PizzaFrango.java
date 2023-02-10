package designpatterns.estruturais.decorator;

public class PizzaFrango extends Pizza {

  public PizzaFrango() {
    super.descricao = "Frango";
    super.preco = 34;
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
