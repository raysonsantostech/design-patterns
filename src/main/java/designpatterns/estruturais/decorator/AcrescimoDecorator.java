package designpatterns.estruturais.decorator;

public abstract class AcrescimoDecorator extends Pizza {

  protected Pizza pizza;

  public AcrescimoDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescricao() {
    return pizza.getDescricao() + " | " + descricao;
  }

  public abstract float getPreco();

}
