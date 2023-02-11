package designpatterns.estruturais.facade.vendas;

import java.util.ArrayList;
import designpatterns.estruturais.facade.Consumidor;
import designpatterns.estruturais.facade.Produto;

public class Pedido {

  private Consumidor consumidor;
  private float valor;
  private ArrayList<Produto> produtos = new ArrayList<Produto>();

  public Pedido(Consumidor consumidor) {
    this.consumidor = consumidor;
    this.valor = 0;
  }

  public void addProduto(Produto produto) {
    this.produtos.add(produto);
    this.valor += produto.getValor();
  }

  public Consumidor getConsumidor() {
    return consumidor;
  }

  public float getValor() {
    return valor;
  }

}
