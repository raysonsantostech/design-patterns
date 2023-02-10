package designpatterns.estruturais.decorator;

public class Cliente {
  public static void main(String[] args) {

    Pizza pizza = new PizzaFrango();
    pizza = new BordaCatupiry(pizza);
    pizza = new BordaRequeijao(pizza);

    System.out.println("########    PEDIDO    ########");
    System.out.println("Descrição: " + pizza.getDescricao());
    System.out.println("Total: " + pizza.getPreco());
    System.out.println("##############################");

    pizza = new PizzaQuatroQueijos();
    pizza = new BordaRequeijao(pizza);

    System.out.println("########    PEDIDO    ########");
    System.out.println("Descrição: " + pizza.getDescricao());
    System.out.println("Total: " + pizza.getPreco());
    System.out.println("##############################");

    pizza = new PizzaCarneDeSol();
    pizza = new BordaCheddar(pizza);

    System.out.println("########    PEDIDO    ########");
    System.out.println("Descrição: " + pizza.getDescricao());
    System.out.println("Total: " + pizza.getPreco());
    System.out.println("##############################");

  }
}
