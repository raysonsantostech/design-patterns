package designpatterns.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {

  private List<String> mensagens = new ArrayList<String>();
  private List<Observer> observers = new ArrayList<Observer>();

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);

  }

  @Override
  public void notifyObservers() {
    String ultimaMensagem = this.mensagens.get(this.mensagens.size() - 1);
    System.out.println("Notificando " + this.observers.size() + " observadores...\n");
    for (Observer observer : observers) {
      observer.update(ultimaMensagem);
    }
  }

  public void addMensagem(String mensagem) {
    this.mensagens.add(mensagem);
    notifyObservers();
  }

}
