package designpatterns.criacionais.prototype;

public class Cliente {
    public static void main(String[] args) {
        GerenciadorDePrototipos gerenciadorDePrototipos = new GerenciadorDePrototipos();

        ArtigoSBC artigoSBCPrototipo = (ArtigoSBC) gerenciadorDePrototipos.getInstance("sbc");

        System.out.println(artigoSBCPrototipo.toString());

        ArtigoSBC artigoSBC = artigoSBCPrototipo.clonePrototype();
        artigoSBC.setTitulo("Artigo SBC");
        artigoSBC.setAutores("Júlio Alves");

        System.out.println(artigoSBC.toString());


    }
}
