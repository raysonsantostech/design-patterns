package designpatterns.criacionais.abstractfactory.caixa;

import designpatterns.criacionais.abstractfactory.CalculoFactory;
import designpatterns.criacionais.abstractfactory.Desconto;
import designpatterns.criacionais.abstractfactory.Juros;
import designpatterns.criacionais.abstractfactory.Multa;

public class CalculoFactoryCaixa implements CalculoFactory {

    @Override
    public Desconto getDesconto() {
        return new DescontoCaixa();
    }

    @Override
    public Juros getJuros() {
        return new JurosCaixa();
    }

    @Override
    public Multa getMulta() {
        return new MultaCaixa();
    }

}
