package designpatterns.criacionais.factorymethod.bancodobrasil;

import designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasilBoleto10Dias extends Boleto {

    public BancoDoBrasilBoleto10Dias(float valor) {
        super(valor);
        super.juros = 0.03f;
        super.desconto = 0.05f;
        super.multa = 0.02f;
    }

}
