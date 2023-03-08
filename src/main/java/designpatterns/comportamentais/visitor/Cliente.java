package designpatterns.comportamentais.visitor;

public class Cliente {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto 1", 10, 5);
        Produto produto2 = new Produto("Produto 2", 12, 4);
        Produto produto3 = new Produto("Produto 3", 20, 6);
        Produto produto4 = new Produto("Produto 4", 40, 12);
        Produto produto5 = new Produto("Produto 5", 80, 25);

        Departamento departamento1 = new Departamento("Departamento 1");
        departamento1.adicionarProduto(produto1);
        departamento1.adicionarProduto(produto2);
        departamento1.adicionarProduto(produto3);

        Departamento departamento2 = new Departamento("Departamento 2");
        departamento2.adicionarProduto(produto4);
        departamento2.adicionarProduto(produto5);

        SuperMercado superMercado = new SuperMercado("Super Mercado");
        superMercado.adicionarDepartamento(departamento1);
        superMercado.adicionarDepartamento(departamento2);

        Visitor lucratividade = new Lucratividade();

        System.out.println("Lucro Super Mercado: R$ " + superMercado.aceitar(lucratividade));

        System.out.println("Lucro Departemento 1: R$ " + departamento1.aceitar(lucratividade));
        System.out.println("Lucro Departemento 2: R$ " + departamento2.aceitar(lucratividade));

        System.out.println("Lucro Produto 1: R$ " + produto1.aceitar(lucratividade));
        System.out.println("Lucro Produto 2: R$ " + produto2.aceitar(lucratividade));
        System.out.println("Lucro Produto 3: R$ " + produto3.aceitar(lucratividade));
        System.out.println("Lucro Produto 4: R$ " + produto4.aceitar(lucratividade));
        System.out.println("Lucro Produto 5: R$ " + produto5.aceitar(lucratividade));

    }
}
