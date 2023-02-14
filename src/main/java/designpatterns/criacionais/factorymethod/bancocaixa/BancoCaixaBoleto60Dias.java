package designpatterns.criacionais.factorymethod.bancocaixa;

import designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixaBoleto60Dias extends Boleto {

    public BancoCaixaBoleto60Dias(float valor) {
        super(valor);
        super.juros = 0.1f;
        super.desconto = 0;
        super.multa = 0.2f;
    }

}
