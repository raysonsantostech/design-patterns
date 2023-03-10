package designpatterns.estruturais.flyweight;

import java.util.ArrayList;

public class Plantacao {
    
    private ArrayList<Arvore> arvores;
    private EspecieFabrica especieFabrica;

    public Plantacao() {
        arvores = new ArrayList<>();
        especieFabrica = new EspecieFabrica();
    }

    public void adicionarArvore(int x, int y, String nome, String cor, float alturaMaxima) {
        Arvore arvore = new Arvore(x, y, especieFabrica.getEspecie(nome, cor, alturaMaxima));
        this.arvores.add(arvore);
    }

    public ArrayList<Arvore> getArvores() {
        return arvores;
    }

    public ArrayList<EspecieFlyweight> getEspecies() {
        return this.especieFabrica.getEspecies();
    }

    
}
