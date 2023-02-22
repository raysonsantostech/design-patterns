package designpatterns.criacionais.abstractfactory.bb;

import designpatterns.criacionais.abstractfactory.CalculoFactory;
import designpatterns.criacionais.abstractfactory.Desconto;
import designpatterns.criacionais.abstractfactory.Juros;
import designpatterns.criacionais.abstractfactory.Multa;

public class CalculoFactoryBB implements CalculoFactory {

    @Override
    public Desconto getDesconto() {
        return new DescontoBB();
    }

    @Override
    public Juros getJuros() {
        return new JurosBB();
    }

    @Override
    public Multa getMulta() {
        return new MultaBB();
    }


}
