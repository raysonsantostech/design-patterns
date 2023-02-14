package designpatterns.criacionais.factorymethod.bancocaixa;

import designpatterns.criacionais.factorymethod.Banco;
import designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixa extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimento, float valor) throws Exception {

        if(vencimento == 10) {
            return new BancoCaixaBoleto10Dias(valor);        
        }

        if(vencimento == 30) {
            return new BancoCaixaBoleto30Dias(valor);        
        }

        if(vencimento == 60) {
            return new BancoCaixaBoleto60Dias(valor);        
        }

        throw new Exception("Prazo de vencimento inválido.");

    }


}
