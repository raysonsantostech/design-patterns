package designpatterns.comportamentais.iterator;

public class Cliente {
    public static void main(String[] args) {
        Lista lista = new Lista(9);
        lista.addItem(1);
        lista.addItem(2);
        lista.addItem(3);
        lista.addItem(4);
        lista.addItem(5);
        lista.addItem(6);
        lista.addItem(7);
        lista.addItem(8);
        lista.addItem(9);
        lista.addItem(10);

        Iterator iterator = lista.criarIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
