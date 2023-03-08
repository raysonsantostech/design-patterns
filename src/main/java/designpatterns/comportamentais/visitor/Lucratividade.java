package designpatterns.comportamentais.visitor;

public class Lucratividade implements Visitor {

    @Override
    public float visitSuperMercado(SuperMercado superMercado) {
        float lucroEmReais = 0;

        for (Departamento departamento : superMercado.getDepartamentos()) {
            for (Produto produto : departamento.getProdutos()) {
                lucroEmReais += calculaLucroEmReaisProduto(produto);
            }
        }

        return lucroEmReais;
    }

    @Override
    public float visitDepartamento(Departamento departamento) {
        float lucroEmReais = 0;

        for (Produto produto : departamento.getProdutos()) {
            lucroEmReais += calculaLucroEmReaisProduto(produto);
        }

        return lucroEmReais;
    }

    @Override
    public float visitProduto(Produto produto) {
        return calculaLucroEmReaisProduto(produto);
    }

    private float calculaLucroEmReaisProduto(Produto produto) {
        return (produto.getPreco() * produto.getMargemLucro()) / 100;
    }
    
}
