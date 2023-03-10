package designpatterns.estruturais.flyweight;

import java.util.Random;

public class Cliente {
    public static void main(String[] args) {

        Plantacao plantacao = new Plantacao();
        Random random = new Random();

        for(int i = 1; i < 10; i++) {
            plantacao.adicionarArvore(random.nextInt(i, 1000), random.nextInt(i, 1000), "canela-preta", "#434926", 45);
            plantacao.adicionarArvore(random.nextInt(i, 1000), random.nextInt(i, 1000), "palmiteiro", "#a3ac97", 40);
            plantacao.adicionarArvore(random.nextInt(i, 1000), random.nextInt(i, 1000), "xaxim-bugio", "#846e38", 4);
        }

        System.out.println("######### Espécies ######### ");
        for (EspecieFlyweight especieFlyweight : plantacao.getEspecies()) {
            System.out.println(especieFlyweight.toString());
        }

        System.out.println("\n######### Árvores ######### ");
        for (Arvore arvore : plantacao.getArvores()) {
            System.out.println(arvore.toString());            
        }

    }
}
