package designpatterns.comportamentais.visitor;

import java.util.ArrayList;

public class SuperMercado implements Elemento {

    private String nome;
    private ArrayList<Departamento> departamentos;

    public SuperMercado(String nome) {
        this.nome = nome;
        departamentos = new ArrayList<Departamento>();
    }

    @Override
    public float aceitar(Visitor visitor) {
        return visitor.visitSuperMercado(this);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
    
    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
}
