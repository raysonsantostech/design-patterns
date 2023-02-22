package designpatterns.criacionais.abstractfactory.caixa;

import designpatterns.criacionais.abstractfactory.Multa;

public class MultaCaixa implements Multa {

    @Override
    public float getValorMulta() {
        return 0.3f;
    }
    
}
