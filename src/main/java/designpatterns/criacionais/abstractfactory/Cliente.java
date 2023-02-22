package designpatterns.criacionais.abstractfactory;

import designpatterns.criacionais.abstractfactory.bb.CalculoFactoryBB;
import designpatterns.criacionais.abstractfactory.caixa.CalculoFactoryCaixa;

public class Cliente {
    public static void main(String[] args) {
        CalculoFactory calculoFactoryCaixa = new CalculoFactoryCaixa();
        CalculoFactory calculoFactoryBB = new CalculoFactoryBB();
        
        Banco banco = new Banco();

        System.out.println("--> Factory Caixa");

        banco.gerarBoleto(1000f, calculoFactoryCaixa);

        System.out.println("--> Factory BB");

        banco.gerarBoleto(1000f, calculoFactoryBB);
    }
}
