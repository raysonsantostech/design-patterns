package designpatterns.estruturais.bridge;

public abstract class Mensagem {

    protected String assunto;
    protected String conteudo;
    protected CanalDeEnvio canalDeEnvio;

    public Mensagem(CanalDeEnvio canalDeEnvio) {
        this.canalDeEnvio = canalDeEnvio;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public CanalDeEnvio getCanalDeEnvio() {
        return canalDeEnvio;
    }

    public void setCanalDeEnvio(CanalDeEnvio canalDeEnvio) {
        this.canalDeEnvio = canalDeEnvio;
    }

    public abstract void enviar();

}
