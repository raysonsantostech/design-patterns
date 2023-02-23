package designpatterns.comportamentais.iterator;

public class Lista implements Agregado {

    private Integer array [];
    private Integer tamanho;
    private Integer indice = 0;

    public Lista(Integer tamanho) {
        this.tamanho = tamanho;
        array = new Integer[this.tamanho];
    }

    public Object getItem(Integer indice) {

        if (indice >= this.tamanho) {
            return null;
        }

        return this.array[indice];
    }

    public void addItem(Integer item) {
        if (indice < this.tamanho) {
            this.array[this.indice] = item;
            this.indice++;
        }
    }

    public Integer getTamanho() {
        return this.tamanho;
    }

    @Override
    public Iterator criarIterator() {
        return new ListaIterator(this);
    }

}
