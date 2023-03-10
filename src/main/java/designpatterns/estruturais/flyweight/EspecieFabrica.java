package designpatterns.estruturais.flyweight;

import java.util.ArrayList;

public class EspecieFabrica {
    
    private ArrayList<EspecieFlyweight> especies;

    public EspecieFabrica() {
        especies = new ArrayList<>();
    }

    public EspecieFlyweight getEspecie(String nome, String cor, float alturaMaxima) {
        for (EspecieFlyweight especieFlyweight : especies) {
            if(especieFlyweight.getNome().equals(nome) && especieFlyweight.getCor().equals(cor) && especieFlyweight.getAlturaMaxima() == alturaMaxima) {
                return especieFlyweight;                
            }            
        }

        EspecieFlyweight especieFlyweight = new EspecieFlyweight(nome, cor, alturaMaxima);
        especies.add(especieFlyweight);

        return especieFlyweight;
    }

    public ArrayList<EspecieFlyweight> getEspecies() {
        return especies;
    }

}
