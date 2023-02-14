package designpatterns.criacionais.factorymethod.bancocaixa;

import designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixaBoleto30Dias extends Boleto {

    public BancoCaixaBoleto30Dias(float valor) {
        super(valor);
        super.juros = 0.05f;
        super.desconto = 0.05f;
        super.multa = 0.1f;
    }

}
