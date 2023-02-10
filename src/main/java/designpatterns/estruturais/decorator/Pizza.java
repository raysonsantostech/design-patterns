package designpatterns.estruturais.decorator;

public abstract class Pizza {
  protected String descricao = "";
  protected float preco = 0;

  public abstract String getDescricao();

  public abstract float getPreco();

}
