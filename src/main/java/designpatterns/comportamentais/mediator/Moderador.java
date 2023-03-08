package designpatterns.comportamentais.mediator;

public class Moderador extends Usuario {

    private Usuario ultimoUsuario;

    public Moderador() {
        super("Moderador da Sala");
        ultimoUsuario = null;
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

    public boolean validarMensagem(Usuario usuario) {
        if(ultimoUsuario != null && ultimoUsuario.equals(usuario)) {
            this.enviar(usuario.getNome() + " sua mensagem foi negada!");
            return false;
        }

        this.ultimoUsuario = usuario;
        return true;
    }
    
    
}
