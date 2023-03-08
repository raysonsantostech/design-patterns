package designpatterns.estruturais.proxy;

public class Cliente {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Santos Dumont", "000.000.000-00", 25);
        System.out.println(usuario.getNome());
        System.out.println(usuario.validarNome());
    }
}
