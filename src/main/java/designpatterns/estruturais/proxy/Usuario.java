package designpatterns.estruturais.proxy;

public class Usuario {

    private String nome;
    private String cpf;
    private int idade;
    private PessoaReceitaFederalInterface pessoaReceitaFederal;

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.pessoaReceitaFederal = new PessoaReceitaFederalProxy(cpf);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean validarNome() {
        return this.nome.equals(this.pessoaReceitaFederal.getNome());
    }

    public boolean validarIdade() {
        return (this.idade >= 18) && (this.pessoaReceitaFederal.getIdade() >= 18);
    }

    public boolean validarCpf() {
        return this.pessoaReceitaFederal.isCpfAtivo();
    }

}
