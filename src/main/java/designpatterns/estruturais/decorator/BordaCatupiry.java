package designpatterns.estruturais.decorator;

public class BordaCatupiry extends AcrescimoDecorator {

  public BordaCatupiry(Pizza pizza) {
    super(pizza);
    super.descricao = "Borda de Catupiry";
    super.preco = 9;
  }

  @Override
  public float getPreco() {
    return preco + pizza.getPreco();
  }

}
