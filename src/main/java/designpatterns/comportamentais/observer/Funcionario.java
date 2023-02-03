package designpatterns.comportamentais.observer;

public class Funcionario implements Observer {

  private String nome;
  private String email;

  public Funcionario(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public void update(String mensagem) {
    Email.enviarEmail(this.email, mensagem);
  }

}
