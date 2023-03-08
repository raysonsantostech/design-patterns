package designpatterns.comportamentais.visitor;

public class Produto implements Elemento {

    private String nome;
    private float preco;
    private float margemLucro;

    public Produto(String nome, float preco, float margemLucro) {
        this.nome = nome;
        this.preco = preco;
        this.margemLucro = margemLucro;
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.visitProduto(this);
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public float getMargemLucro() {
        return margemLucro;
    }
    
}
