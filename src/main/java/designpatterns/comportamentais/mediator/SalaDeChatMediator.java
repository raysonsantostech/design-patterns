package designpatterns.comportamentais.mediator;

public interface SalaDeChatMediator {

    public String getNome();

    public void enviarMensagem(String mensagem, Usuario usuario);

    public void adicionarUsuario(Usuario usuario);

    public void removerUsuario(Usuario usuario);
    
}
