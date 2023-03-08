package designpatterns.estruturais.composite;

public class Cliente {

    public static void main(String[] args) {
        Componente raiz = new Pasta("Raiz", "/");
        Componente pasta1 = new Pasta("Pasta 1", "pasta1/");
        Componente pasta2 = new Pasta("Pasta 2", "pasta2/");
        Componente pasta3 = new Pasta("Pasta 3", "pasta3/");

        Componente pasta2_1 = new Pasta("Pasta 2_1", "pasta2_1/");
        Componente pasta2_2 = new Pasta("Pasta 2_2", "pasta2_2/");
        Componente pasta2_2_1 = new Pasta("Pasta 2_2_1", "pasta2_2_1/");

        Componente arquivo1 = new Arquivo("Arquivo 1", "arquivo1.ext");
        Componente arquivo2 = new Arquivo("Arquivo 2", "arquivo2.ext");
        Componente arquivo3 = new Arquivo("Arquivo 3", "arquivo3.ext");
        Componente arquivo4 = new Arquivo("Arquivo 4", "arquivo4.ext");
        Componente arquivo5 = new Arquivo("Arquivo 5", "arquivo5.ext");
        Componente arquivo6 = new Arquivo("Arquivo 6", "arquivo6.ext");

        pasta1.adicionar(arquivo1);

        pasta2.adicionar(arquivo2);
        pasta2.adicionar(pasta2_1);
        pasta2.adicionar(pasta2_2);

        pasta2_1.adicionar(arquivo3);
        
        pasta2_2.adicionar(pasta2_2_1);
        pasta2_2.adicionar(arquivo4);

        pasta3.adicionar(arquivo5);
        pasta3.adicionar(arquivo6);

        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);
        raiz.adicionar(pasta3);


        GerenciadorDeArquivos gerenciadorDeArquivos = new GerenciadorDeArquivos(raiz);

        //gerenciadorDeArquivos.exibirTodos();
        
        gerenciadorDeArquivos.exibirCaminhoCompleto();




    }
}
