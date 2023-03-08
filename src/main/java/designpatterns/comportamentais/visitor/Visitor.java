package designpatterns.comportamentais.visitor;

public interface Visitor {

    public float visitSuperMercado(SuperMercado superMercado);

    public float visitDepartamento(Departamento departamento);

    public float visitProduto(Produto produto);

}
