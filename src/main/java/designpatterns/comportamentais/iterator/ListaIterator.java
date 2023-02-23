package designpatterns.comportamentais.iterator;

public class ListaIterator implements Iterator {

    private Lista lista;
    private int indice = 0;

    public ListaIterator(Lista lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {

        if(this.indice < this.lista.getTamanho()) {
            return true;
        }

        return false;
    }

    @Override
    public Object next() {
        return lista.getItem(this.indice++);
    }
    
}
