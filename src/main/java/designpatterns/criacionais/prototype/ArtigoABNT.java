package designpatterns.criacionais.prototype;

public class ArtigoABNT implements Prototype {

    private String titulo;
    private String autor;
    private String resumo;
    private String palavrasChave;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    @Override
    public Prototype clonePrototype() {
        ArtigoABNT clone = new ArtigoABNT();

        clone.setTitulo(this.getTitulo());
        clone.setAutor(this.getAutor());
        clone.setResumo(this.getResumo());
        clone.setPalavrasChave(this.getPalavrasChave());

        return clone;
    }
    
}
