package designpatterns.criacionais.abstractfactory.caixa;

import designpatterns.criacionais.abstractfactory.Juros;

public class JurosCaixa implements Juros {

    @Override
    public float getValorJuros() {
        return 0.2f;
    }

}
