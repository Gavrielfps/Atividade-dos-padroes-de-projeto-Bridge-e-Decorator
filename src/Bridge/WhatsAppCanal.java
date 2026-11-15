package Bridge;

class WhatsAppCanal implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[WHATSAPP] Para: " + destinatario + " | " + mensagem);
    }
}
