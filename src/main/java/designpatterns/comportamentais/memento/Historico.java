package designpatterns.comportamentais.memento;

import java.util.ArrayList;

public class Historico {

    private ArrayList<MementoInterface> mementos;

    public Historico() {
        mementos = new ArrayList<MementoInterface>();
    }

    public void criarCheckPoint(OriginadorInterface originadorInterface) {
        mementos.add(originadorInterface.salvar());
    }

    public void desfazer() {
        if(!mementos.isEmpty()) {
            MementoInterface mementoInterface = mementos.get(mementos.size()-1);
            mementoInterface.restaurar();
            mementos.remove(mementoInterface);
        }
    }

    public void imprimir(OriginadorInterface originadorInterface) {
        originadorInterface.imprimir();
    }
    
}
