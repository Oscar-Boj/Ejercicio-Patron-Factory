public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();
        Notificacion email = factory.crearNotificacion("EMAIL");
        email.enviarMensaje("Hola, esto es un email!");

        Notificacion sms = factory.crearNotificacion("SMS");
        sms.enviarMensaje("Hola, esto es un SMS!");

        Notificacion app = factory.crearNotificacion("APP");
        app.enviarMensaje("Hola, esto es un mensaje en la app!");
    }
}