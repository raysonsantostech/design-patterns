package designpatterns.comportamentais.mediator;

public class Cliente {
    public static void main(String[] args) {
        Moderador moderador = new Moderador();
        SalaDeChatMediator salaDeChat = new SalaDeChat("SalaDeChat 01", moderador);
        
        Moderador moderador02 = new Moderador();
        SalaDeChatMediator salaDeChat02 = new SalaDeChat("SalaDeChat 02", moderador02);

        Humano marta = new Humano("Marta");
        Humano maria = new Humano("Maria");
        Humano mario = new Humano("Mário");
        Humano angelo = new Humano("Angêlo");
        Humano miguel = new Humano("Miguel");

        marta.setSalaDeChat(salaDeChat);
        maria.setSalaDeChat(salaDeChat);
        mario.setSalaDeChat(salaDeChat);

        angelo.setSalaDeChat(salaDeChat02);
        miguel.setSalaDeChat(salaDeChat02);

        marta.enviar("Olá, pessoal! Tudo bem com vocês?");
        marta.enviar("Olá, pessoal! Tudo bem com vocês?");
        maria.enviar("Oi, gente! Tudo bem por aqui! E por aí?");

        angelo.enviar("Oi, pessoal!");
        angelo.enviar("Alguém?");
        angelo.enviar("Olá! Eu sou o miguel!");


        

        
    }
}
