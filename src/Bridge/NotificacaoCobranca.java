package Bridge;

import java.util.Locale;

class NotificacaoCobranca extends Notificacao {
    private final double valor;
    private final String vencimento;

    public NotificacaoCobranca(CanalEnvio canal, double valor, String vencimento) {
        super(canal);
        this.valor = valor;
        this.vencimento = vencimento;
    }

    @Override
    public void notificar(String destinatario, String conteudo) {
        String mensagem = String.format(Locale.US,
                "💳 Cobrança: %s | Valor: R$ %.2f | Vencimento: %s",
                conteudo, valor, vencimento);
        canal.enviar(destinatario, mensagem);
    }
}

