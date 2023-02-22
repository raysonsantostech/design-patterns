package designpatterns.criacionais.abstractfactory.caixa;

import designpatterns.criacionais.abstractfactory.Desconto;

public class DescontoCaixa implements Desconto {

    @Override
    public float getValorDesconto() {
        return 0.1f;
    }

}
