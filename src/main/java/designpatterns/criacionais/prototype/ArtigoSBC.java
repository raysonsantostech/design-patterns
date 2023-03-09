package designpatterns.criacionais.prototype;

public class ArtigoSBC implements Prototype {

    private String titulo;
    private String autores;
    private String universidade;
    private String departamento;
    private String emails;
    private String resumo;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public ArtigoSBC clonePrototype() {
        ArtigoSBC clone = new ArtigoSBC();
        
        clone.setTitulo(this.getTitulo());
        clone.setAutores(this.getAutores());
        clone.setUniversidade(this.getUniversidade());
        clone.setDepartamento(this.getDepartamento());
        clone.setEmails(this.getEmails());
        clone.setResumo(this.getResumo());

        return clone;
    }

    @Override
    public String toString() {
        return "ArtigoSBC \ntitulo=\t\t" + titulo + "\nautores=\t" + autores + "\nuniversidade=\t" + universidade + "\ndepartamento=\t" + departamento + "\nemails=\t\t" + emails + "\nresumo=\t\t" + resumo;
    }

}
