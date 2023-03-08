package designpatterns.comportamentais.mediator;

import java.util.ArrayList;

public class SalaDeChat implements SalaDeChatMediator {

    private String nome;
    private Moderador moderador;
    private ArrayList<Usuario> usuarios;

    public SalaDeChat(String nome, Moderador moderador) {
        this.usuarios = new ArrayList<Usuario>();

        this.nome = nome;
        this.moderador = moderador;
        this.moderador.setSalaDeChat(this);
    }

    public String getNome() {
        return nome;
    }

    public Moderador getModerador() {
        return moderador;
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuarioRemetente) {
        if(this.moderador.validarMensagem(usuarioRemetente)) {
            for (Usuario usuarioDestinario : usuarios) {
                if(!usuarioDestinario.equals(usuarioRemetente)) {
                    usuarioDestinario.receber(mensagem);
                }
            }
            System.out.println("\n#########################################\n");
        }
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    
}
