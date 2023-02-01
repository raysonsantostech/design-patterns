package designpatterns.comportamentais.strategy;

public class Cliente {
  public static void main(String[] args) {
    Frete freteComum = new FreteComum();
    Frete freteExpresso = new FreteExpresso();

    Pedido pedido = new Pedido();
    pedido.setValor(100);
    pedido.setTipoFrete(freteComum);
    System.out.println("Pedido com Frete Comum");
    System.out.printf("Valor do pedido: R$ %.2f \n", pedido.getValor());
    System.out.printf("Valor do frete comum: R$ %.2f \n", pedido.calculaFrete());
    System.out.printf("Valor Total: R$ %.2f \n\n", pedido.calculaTotal());

    pedido.setTipoFrete(freteExpresso);
    
    System.out.println("Pedio com Frete Expresso");
    System.out.printf("Valor do pedido: R$ %.2f \n", pedido.getValor());
    System.out.printf("Valor do frete expresso: R$ %.2f \n", pedido.calculaFrete());
    System.out.printf("Valor Total: R$ %.2f \n\n", pedido.calculaTotal());

  }
}
