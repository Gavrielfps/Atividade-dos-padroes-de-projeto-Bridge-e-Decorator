package Bridge;

public class Main {
    public static void main(String[] args) {
        CanalEnvio email = new EmailCanal();
        CanalEnvio sms = new SmsCanal();
        CanalEnvio whatsapp = new WhatsAppCanal();

        new NotificacaoSimples(email)
                .notificar("gustavo@email.com", "Seu pedido foi confirmado.");

        new NotificacaoUrgente(sms)
                .notificar("+55 83 99999-0000", "Atividade suspeita na sua conta");

        new NotificacaoCobranca(whatsapp, 149.90, "13/12/2026")
                .notificar("+55 83 98888-1111", "Fatura de novembro");

        new NotificacaoUrgente(whatsapp)
                .notificar("+55 83 98888-1111", "Servidor fora do ar");

        new NotificacaoCobranca(email, 89.00, "17/12/2026")
                .notificar("lucas@email.com", "Mensalidade");
    }
}