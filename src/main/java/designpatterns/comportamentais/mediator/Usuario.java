package designpatterns.comportamentais.mediator;

public abstract class Usuario {
    
    protected String nome;
    protected SalaDeChatMediator salaDeChat;    

    public Usuario(String nome) {
        this.nome = nome;
        this.salaDeChat = null;
    }

    public abstract void enviar(String mensagem);

    public abstract void receber(String mensagem);

    public void setSalaDeChat(SalaDeChatMediator salaDeChat) {
        if(this.salaDeChat != null) {
            this.salaDeChat.removerUsuario(this);
            System.out.println("null");
        }

        this.salaDeChat = salaDeChat;
        this.salaDeChat.adicionarUsuario(this);
    }


    public String getNome() {
        return nome;
    }

    
}
