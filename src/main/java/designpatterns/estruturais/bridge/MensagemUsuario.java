package designpatterns.estruturais.bridge;

public class MensagemUsuario extends Mensagem {

    public MensagemUsuario(CanalDeEnvio canalDeEnvio) {
        super(canalDeEnvio);
    }

    @Override
    public void enviar() {
        this.canalDeEnvio.enviar(assunto, conteudo);
    }

}
