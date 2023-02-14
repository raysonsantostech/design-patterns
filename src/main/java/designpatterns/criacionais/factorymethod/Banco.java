package designpatterns.criacionais.factorymethod;

public abstract class Banco {

    protected Boleto boleto;

    public void gerarBoleto(int vencimento, float valor) throws Exception{
        this.boleto = criarBoleto(vencimento, valor);

        System.out.println("Valor: " + boleto.getValor());
        System.out.println("Desconto: " + boleto.calcularDesconto());
        System.out.println("Juros: " + boleto.calcularJuros());
        System.out.println("Multa: " + boleto.calcularMulta());
        System.out.println("----------------\n");
    };

    protected abstract Boleto criarBoleto(int vencimento, float valor) throws Exception;
    
}
