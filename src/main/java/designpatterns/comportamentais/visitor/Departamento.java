package designpatterns.comportamentais.visitor;

import java.util.ArrayList;

public class Departamento implements Elemento {

    private String nome;
    private ArrayList<Produto> produtos;

    public Departamento(String nome) {
        this.nome = nome;
        produtos = new ArrayList<Produto>();
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.visitDepartamento(this);
    }

    public String getNome() {
        return nome;
    } 
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }    
}
