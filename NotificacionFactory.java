/**
 * NotificacionFactory
 */
public interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();
    
} 