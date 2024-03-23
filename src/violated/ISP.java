package violated;

public class ISP {
    interface NotificationService {
        void sendEmail(String recipient, String message);
        void sendText(String phoneNumber, String message);
        void sendPushNotification(String deviceId, String message);
    }
}
