package Bridge;

abstract class Notificacao {
    protected final CanalEnvio canal;

    protected Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String conteudo);
}

