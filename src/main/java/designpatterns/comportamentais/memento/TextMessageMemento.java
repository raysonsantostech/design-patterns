package designpatterns.comportamentais.memento;

public class TextMessageMemento implements MementoInterface {
    
    private TextMessage textMessage;
    private String text;
    private String ansiBackground;

    public TextMessageMemento(TextMessage textBox, String text, String fontFamily) {
        this.textMessage = textBox;
        this.text = text;
        this.ansiBackground = fontFamily;
    }    

    public String getText() {
        return text;
    }    
    
    public String getAnsiBackground() {
        return ansiBackground;
    }    

    @Override
    public void restaurar() {
        this.textMessage.setText(text);
        this.textMessage.setAnsiBackground(ansiBackground);
    }

}
