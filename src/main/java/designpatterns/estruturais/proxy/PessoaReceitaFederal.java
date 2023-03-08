package designpatterns.estruturais.proxy;

public class PessoaReceitaFederal implements PessoaReceitaFederalInterface {

    private boolean cpfAtivo;
    private String nome;
    private String cpf;
    private int idade;
    

    public PessoaReceitaFederal(String cpf) {
        try {
            this.cpfAtivo = true;
            this.cpf = cpf;
            this.nome = "Santos Dumont";
            this.idade = 25;
            
            Thread.sleep(5000);
            System.out.println("Criado após 5 segundos.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        return nome;
    }

    public boolean isCpfAtivo() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        return cpfAtivo;
    }

    public int getIdade() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        return idade;
    }

    public String getCpf() {
        return cpf;
    }

}
