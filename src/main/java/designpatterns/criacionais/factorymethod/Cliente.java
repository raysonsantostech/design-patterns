package designpatterns.criacionais.factorymethod;

import designpatterns.criacionais.factorymethod.bancocaixa.BancoCaixa;
import designpatterns.criacionais.factorymethod.bancodobrasil.BancoDoBrasil;

public class Cliente {
    public static void main(String[] args) {
        
        try {
            Banco banco = new BancoCaixa();

            System.out.println("Banco Caixa\n");
            
            banco.gerarBoleto(10, 1000f);
            banco.gerarBoleto(30, 1000f);
            banco.gerarBoleto(60, 1000f);

            System.out.println("Banco Do Brasil\n");

            banco = new BancoDoBrasil();

            banco.gerarBoleto(10, 1000f);
            banco.gerarBoleto(30, 1000f);
            banco.gerarBoleto(60, 1000f);


        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

        
    }
}
