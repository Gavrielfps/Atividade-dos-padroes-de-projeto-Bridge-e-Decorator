package Bridge;

class NotificacaoSimples extends Notificacao {
    public NotificacaoSimples(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String conteudo) {
        canal.enviar(destinatario, conteudo);
    }
}
