package designpatterns.estruturais.composite;

import java.util.ArrayList;

public class Pasta extends Componente {

    private String nome;
    private String caminho;
    private ArrayList<Componente> componentes;

    public Pasta(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
        componentes = new ArrayList<Componente>();
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " [ " + caminho + " ] ");
        for (Componente componente : componentes) {
            componente.exibir();
        }        
    }

    public void adicionar(Componente componente) {
        this.componentes.add(componente);
    }

    public void remover(Componente componente) {
        this.componentes.remove(componente);
    }

    public Componente getFilho(int indice) {
        return this.componentes.get(indice);
    }

    public void exibirCaminhoCompleto(String path) {
        for (Componente componente : componentes) {
            String patha = path + componente.getCaminho();
            System.out.println(patha);
            componente.exibirCaminhoCompleto(patha);
        }           
    }    
}
