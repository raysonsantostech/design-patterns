package designpatterns.estruturais.facade;

import designpatterns.estruturais.facade.vendas.VendaFacede;

public class Cliente {
  public static void main(String[] args) {
    Consumidor consumidor = new Consumidor("Miguilim ", "miguilim@mail.com");

    Produto produtoA = new Produto("Produto A", 20);
    Produto produtoB = new Produto("Produto B", 210);
    Produto produtoC = new Produto("Produto C", 120);

    VendaFacede vendaFacede = new VendaFacede(consumidor);
    vendaFacede.addProduto(produtoA);
    vendaFacede.addProduto(produtoB);
    vendaFacede.addProduto(produtoC);

    vendaFacede.pagarPorCredito();
    vendaFacede.pagarPorBoleto();

  }
}
