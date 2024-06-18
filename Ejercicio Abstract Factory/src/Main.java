public class Main {
    public static void main(String[] args) {
        NotificacionFactory urgenteFactory = new UrgenteNotificacionFactory();
        NotificacionFactory regularFactory = new RegularNotificacionFactory();

        EmailNotificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        SMSNotificacion urgenteSMS = urgenteFactory.crearSMSNotificacion();
        AppNotificacion urgenteApp = urgenteFactory.crearAppNotificacion();

        EmailNotificacion regularEmail = regularFactory.crearEmailNotificacion();
        SMSNotificacion regularSMS = regularFactory.crearSMSNotificacion();
        AppNotificacion regularApp = regularFactory.crearAppNotificacion();

        urgenteEmail.enviarEmail("Este es un mensaje urgente.");
        urgenteSMS.enviarSMS("Este es un mensaje SMS urgente.");
        urgenteApp.enviarMensajeApp("Este es un mensaje urgente.");

        regularEmail.enviarEmail("Este es un mensaje regular.");
        regularSMS.enviarSMS("Este es un mensaje SMS regular.");
        regularApp.enviarMensajeApp("Este es un mensaje regular.");
    }
}