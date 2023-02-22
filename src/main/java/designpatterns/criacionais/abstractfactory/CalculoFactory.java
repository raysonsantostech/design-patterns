package designpatterns.criacionais.abstractfactory;

public interface CalculoFactory {

    public Desconto getDesconto();

    public Juros getJuros();

    public Multa getMulta();

}
