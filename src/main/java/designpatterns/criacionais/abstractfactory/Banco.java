package designpatterns.criacionais.abstractfactory;

public class Banco {
    
    private Boleto boleto;

    public void gerarBoleto(float valor, CalculoFactory calculoFactory) {
        this.boleto = new Boleto(valor, calculoFactory);

        System.out.println("####  Boleto  ####");
        System.out.println("Valor: " + this.boleto.getValor());
        System.out.println("Desconto: " + this.boleto.calcularDesconto());
        System.out.println("Juros: " + this.boleto.calcularJuros());
        System.out.println("Multa: " + this.boleto.calcularMulta());
        System.out.println();
    }
    
}
