package designpatterns.estruturais.facade;

public class Produto {

  private String nome;
  private float valor;

  public Produto(String nome, float valor) {
    this.nome = nome;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public float getValor() {
    return valor;
  }

}
