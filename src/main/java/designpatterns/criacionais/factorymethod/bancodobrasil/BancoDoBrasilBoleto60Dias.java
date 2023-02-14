package designpatterns.criacionais.factorymethod.bancodobrasil;

import designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasilBoleto60Dias extends Boleto {

    public BancoDoBrasilBoleto60Dias(float valor) {
        super(valor);
        super.juros = 0.1f;
        super.desconto = 0;
        super.multa = 0.15f;
    }

}
