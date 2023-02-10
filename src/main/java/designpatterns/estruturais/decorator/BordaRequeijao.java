package designpatterns.estruturais.decorator;

public class BordaRequeijao extends AcrescimoDecorator {

  public BordaRequeijao(Pizza pizza) {
    super(pizza);
    super.descricao = "Borda de Requeijão";
    super.preco = 9;
  }

  @Override
  public float getPreco() {
    return preco + pizza.getPreco();
  }

}
