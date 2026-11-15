package Bridge;

class SmsCanal implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[SMS] Para: " + destinatario + " | " + mensagem);
    }
}
