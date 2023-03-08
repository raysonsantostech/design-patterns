package designpatterns.estruturais.bridge;

public class Cliente {
    public static void main(String[] args) {

        CanalDeEnvio email = new Email();
        CanalDeEnvio sms = new SMS();

        Mensagem mensagem = new MensagemAdmin(email);
        
        mensagem.setAssunto("Email para Administrador");
        mensagem.setConteudo("Conteúdo da mensagem email");
        mensagem.enviar();

        mensagem = new MensagemAdmin(sms);
        mensagem.setAssunto("SMS para Administrador");
        mensagem.setConteudo("Conteúdo da mensagem SMS");
        mensagem.enviar();

        mensagem = new MensagemUsuario(email);
        mensagem.setAssunto("Email para Usúario");
        mensagem.setConteudo("Conteúdo da mensagem email");
        mensagem.enviar();

        mensagem = new MensagemUsuario(sms);
        mensagem.setAssunto("SMS para Usúario");
        mensagem.setConteudo("Conteúdo da mensagem SMS");
        mensagem.enviar();
        

    }
}
