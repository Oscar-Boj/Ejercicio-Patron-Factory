public class RegularNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new RegularEmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new RegularSMSNotificacion();
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new RegularAppNotificacion();
    }

    class RegularEmailNotificacion implements EmailNotificacion {
        @Override
        public void enviarEmail(String mensaje) {
            System.out.println("Enviando email regular: " + mensaje);
        }
    }

    class RegularSMSNotificacion implements SMSNotificacion {
        @Override
        public void enviarSMS(String mensaje) {
            System.out.println("Enviando SMS regular: " + mensaje);
        }
    }

    class RegularAppNotificacion implements AppNotificacion {
        @Override
        public void enviarMensajeApp(String mensaje) {
            System.out.println("Enviando mensaje regular en la app: " + mensaje);
        }
    }
}
