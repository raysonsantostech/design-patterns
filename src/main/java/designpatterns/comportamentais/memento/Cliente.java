package designpatterns.comportamentais.memento;


public class Cliente {
    public static void main(String[] args) {

        Historico historico = new Historico();

        TextMessage textMessage = new TextMessage("Mensagem com background verde", "\u001B[42m");
        textMessage.imprimir();

        historico.criarCheckPoint(textMessage);

        textMessage.setText("Mensagem com background amarelo");
        textMessage.setAnsiBackground("\u001B[43m");
        textMessage.imprimir();

        historico.criarCheckPoint(textMessage);

        textMessage.setText("Mensagem com background vermelho");
        textMessage.setAnsiBackground("\u001B[41m");
        textMessage.imprimir();

        historico.desfazer();
        historico.imprimir(textMessage);

        historico.desfazer();
        historico.imprimir(textMessage);

        

        

    }
}
