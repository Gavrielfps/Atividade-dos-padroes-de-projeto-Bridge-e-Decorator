package Bridge;

class EmailCanal implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[E-MAIL] Para: " + destinatario + " | " + mensagem);
    }
}
