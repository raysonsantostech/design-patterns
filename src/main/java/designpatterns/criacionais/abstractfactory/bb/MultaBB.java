package designpatterns.criacionais.abstractfactory.bb;

import designpatterns.criacionais.abstractfactory.Multa;

public class MultaBB implements Multa {

    @Override
    public float getValorMulta() {
        return 0.04f;
    }

}
