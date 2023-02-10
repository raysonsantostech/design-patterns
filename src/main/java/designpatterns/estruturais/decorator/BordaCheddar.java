package designpatterns.estruturais.decorator;

public class BordaCheddar extends AcrescimoDecorator {

  public BordaCheddar(Pizza pizza) {
    super(pizza);
    super.descricao = "Borda de Cheddar";
    super.preco = 12;
  }

  @Override
  public float getPreco() {
    return preco + pizza.getPreco();
  }

}
