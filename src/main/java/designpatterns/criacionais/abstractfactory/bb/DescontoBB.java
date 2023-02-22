package designpatterns.criacionais.abstractfactory.bb;

import designpatterns.criacionais.abstractfactory.Desconto;

public class DescontoBB implements Desconto {

    @Override
    public float getValorDesconto() {
        return 0.08f;
    }

}
