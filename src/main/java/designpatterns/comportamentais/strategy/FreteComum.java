package designpatterns.comportamentais.strategy;

public class FreteComum implements Frete {

    @Override
    public double calcula(double valor) {
        return valor * 0.05;
    }
    
}
