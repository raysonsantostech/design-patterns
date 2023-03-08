package designpatterns.comportamentais.memento;

public class TextMessage implements OriginadorInterface {
    
    private String text;
    private String ansiBackground;

    public TextMessage(String text, String ansiBackground) {
        this.text = text;
        this.ansiBackground = ansiBackground;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnsiBackground() {
        return ansiBackground;
    }

    public void setAnsiBackground(String ansiBackground) {
        this.ansiBackground = ansiBackground;
    }

    @Override
    public MementoInterface salvar() {
        return new TextMessageMemento(this, text, ansiBackground);
    }

    @Override
    public void imprimir() {
        System.out.println("Endereço do objeto: " + this);
        System.out.println(ansiBackground + " [ " + text + " ] \u001B[0m");
    }

}
