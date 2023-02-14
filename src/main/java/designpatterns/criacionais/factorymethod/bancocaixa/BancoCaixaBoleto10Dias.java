package designpatterns.criacionais.factorymethod.bancocaixa;

import designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixaBoleto10Dias extends Boleto {

    public BancoCaixaBoleto10Dias(float valor) {
        super(valor);
        super.juros = 0.02f;
        super.desconto = 0.1f;
        super.multa = 0.05f;
    }

}
