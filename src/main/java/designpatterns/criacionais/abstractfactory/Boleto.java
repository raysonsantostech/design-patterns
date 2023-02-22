package designpatterns.criacionais.abstractfactory;

public class Boleto {

    private float valor;
    private CalculoFactory calculoFactory;

    public Boleto(float valor, CalculoFactory calculoFactory) {
        this.valor = valor;
        this.calculoFactory = calculoFactory;
    }

    public float calcularDesconto() {
        return this.valor * this.calculoFactory.getDesconto().getValorDesconto();
    }

    public float calcularJuros() {
        return this.valor * this.calculoFactory.getJuros().getValorJuros();
    }

    public float calcularMulta() {
        return this.valor * this.calculoFactory.getMulta().getValorMulta();
    }

    public float getValor() {
        return valor;
    }

}
