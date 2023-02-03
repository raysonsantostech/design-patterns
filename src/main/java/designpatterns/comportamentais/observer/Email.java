package designpatterns.comportamentais.observer;

public class Email {

  public static void enviarEmail(String email, String mensagem) {
    System.out.println("Enviando mensagem para: " + email);
    System.out.println("Assunto: " + mensagem);
    System.out.println();
  }

}
