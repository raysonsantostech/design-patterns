package designpatterns.comportamentais.strategy;

public class FreteExpresso implements Frete {

    @Override
    public double calcula(double valor) {
        return valor * 0.1;
    }
    
}
