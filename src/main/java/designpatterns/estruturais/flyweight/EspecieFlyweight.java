package designpatterns.estruturais.flyweight;

public class EspecieFlyweight {

    private String nome;
    private String cor;
    private float alturaMaxima;

    public EspecieFlyweight(String nome, String cor, float alturaMaxima) {
        this.nome = nome;
        this.cor = cor;
        this.alturaMaxima = alturaMaxima;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public float getAlturaMaxima() {
        return alturaMaxima;
    }
    
    public void setAlturaMaxima(float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", cor=" + cor + ", alturaMaxima=" + alturaMaxima + "]";
    }   

}
