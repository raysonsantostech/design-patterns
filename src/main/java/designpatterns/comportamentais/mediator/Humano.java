package designpatterns.comportamentais.mediator;

public class Humano extends Usuario {

    public Humano(String nome) {
        super(nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(this.getNome() + " enviou uma mensagem em: " + this.salaDeChat.getNome());
        System.out.println("----");
        this.salaDeChat.enviarMensagem(mensagem, this);
        
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(this.getNome() + " recebeu: " + mensagem);
    }

}
