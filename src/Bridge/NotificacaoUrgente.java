package Bridge;

class NotificacaoUrgente extends Notificacao {
    public NotificacaoUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String conteudo) {
        String mensagem = "🚨 URGENTE: " + conteudo.toUpperCase() + " 🚨";
        canal.enviar(destinatario, mensagem);
    }
}
