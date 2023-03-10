package designpatterns.estruturais.flyweight;

public class Arvore {
    
    private int x;
    private int y;
    private EspecieFlyweight especieFlyweight;

    public Arvore(int x, int y, EspecieFlyweight especieFlyweight) {
        this.x = x;
        this.y = y;
        this.especieFlyweight = especieFlyweight;
    }

    @Override
    public String toString() {
        return "Arvore [x=" + x + ", y=" + y + ", especie=" + especieFlyweight.toString() + "]";
    }

    

}
