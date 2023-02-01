package designpatterns.comportamentais.strategy;

public class Pedido {
    private double valor;
    private Frete tipoFrete;

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Frete getTipoFrete() {
        return tipoFrete;
    }
    public void setTipoFrete(Frete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public double calculaFrete() {
        return tipoFrete.calcula(this.valor);
    }

    public double calculaTotal() {
        return valor + tipoFrete.calcula(this.valor);
    }

}
