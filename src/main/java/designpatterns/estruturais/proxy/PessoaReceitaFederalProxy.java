package designpatterns.estruturais.proxy;

public class PessoaReceitaFederalProxy implements PessoaReceitaFederalInterface {

    private String cpf;
    private PessoaReceitaFederalInterface pessoaReceitaFederal;

    public PessoaReceitaFederalProxy(String cpf) {
        this.cpf = cpf;
    }

    public void criarPessoaFisicaReceitaFederal() {
        if(null == pessoaReceitaFederal) {
            pessoaReceitaFederal = new PessoaReceitaFederal(cpf);
        }
    }

    public String getNome() {
        this.criarPessoaFisicaReceitaFederal();
        return this.pessoaReceitaFederal.getNome();
    }

    public boolean isCpfAtivo() {
        this.criarPessoaFisicaReceitaFederal();
        return this.pessoaReceitaFederal.isCpfAtivo();
    }

    public int getIdade() {
        this.criarPessoaFisicaReceitaFederal();
        return this.pessoaReceitaFederal.getIdade();
    }

}
