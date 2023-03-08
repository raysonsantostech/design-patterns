package designpatterns.estruturais.bridge;

public class SMS implements CanalDeEnvio {

    @Override
    public void enviar(String assunto, String conteudo) {
        System.out.println("Mensagem enviada por SMS");
        System.out.println("Assunto: " + assunto);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println();
    }

}
