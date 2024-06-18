public class UrgenteNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new UrgenteEmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new UrgenteSMSNotificacion();
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new UrgenteAppNotificacion();
    }

    class UrgenteEmailNotificacion implements EmailNotificacion {
        @Override
        public void enviarEmail(String mensaje) {
            System.out.println("Enviando email urgente: " + mensaje);
        }
    }

    class UrgenteSMSNotificacion implements SMSNotificacion {
        @Override
        public void enviarSMS(String mensaje) {
            System.out.println("Enviando SMS urgente: " + mensaje);
        }
    }

    class UrgenteAppNotificacion implements AppNotificacion {
        @Override
        public void enviarMensajeApp(String mensaje) {
            System.out.println("Enviando mensaje urgente en la app: " + mensaje);
        }
    }
}
