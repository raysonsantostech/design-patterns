package designpatterns.criacionais.factorymethod.bancodobrasil;

import designpatterns.criacionais.factorymethod.Banco;
import designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasil extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimento, float valor) throws Exception {

        if(vencimento == 10) {
            return new BancoDoBrasilBoleto10Dias(valor);        
        }

        if(vencimento == 30) {
            return new BancoDoBrasilBoleto30Dias(valor);        
        }

        if(vencimento == 60) {
            return new BancoDoBrasilBoleto60Dias(valor);        
        }

        throw new Exception("Prazo de vencimento inválido.");

    }


}
