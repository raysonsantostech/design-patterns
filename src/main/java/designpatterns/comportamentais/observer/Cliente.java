package designpatterns.comportamentais.observer;

public class Cliente {

  public static void main(String[] args) {

    NewsLetter newsLetter = new NewsLetter();

    Funcionario funcionario1 = new Funcionario("Funcionario 1", "funcionario1@mail.com");
    Funcionario funcionario2 = new Funcionario("Funcionario 2", "funcionario2@mail.com");

    Parceiro parceiro1 = new Parceiro("Parceiro 1", "parceiro1@mail.com");
    Parceiro parceiro2 = new Parceiro("Parceiro 2", "parceiro2@mail.com");

    newsLetter.registerObserver(funcionario1);
    newsLetter.registerObserver(funcionario2);
    newsLetter.registerObserver(parceiro1);
    newsLetter.registerObserver(parceiro2);
    newsLetter.addMensagem("1ª Mensagem");

    System.out.println("#####\n");

    newsLetter.removeObserver(funcionario1);
    newsLetter.addMensagem("2ª Mensagem");

    System.out.println("#####\n");

    newsLetter.registerObserver(funcionario1);
    newsLetter.addMensagem("3ª Mensagem");

    System.out.println("#####\n");

  }

}
