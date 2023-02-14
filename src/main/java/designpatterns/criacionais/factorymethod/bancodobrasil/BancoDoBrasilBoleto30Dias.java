package designpatterns.criacionais.factorymethod.bancodobrasil;

import designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasilBoleto30Dias extends Boleto {

    public BancoDoBrasilBoleto30Dias(float valor) {
        super(valor);
        super.juros = 0.05f;
        super.desconto = 0.02f;
        super.multa = 0.05f;
    }

}
