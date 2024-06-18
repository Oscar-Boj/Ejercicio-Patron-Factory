public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        if (tipo == null || tipo.isEmpty())
            return null;
        switch (tipo) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "APP":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipo);
        }
    }
}
