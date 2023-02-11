package designpatterns.estruturais.facade;

public class Consumidor {
  private String nome;
  private String email;

  public Consumidor(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

}
