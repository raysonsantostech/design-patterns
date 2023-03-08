package designpatterns.estruturais.bridge;

public class MensagemAdmin extends Mensagem {

    public MensagemAdmin(CanalDeEnvio canalDeEnvio) {
        super(canalDeEnvio);
    }

    @Override
    public void enviar() {
        this.canalDeEnvio.enviar(assunto, conteudo);
    }
    
}
