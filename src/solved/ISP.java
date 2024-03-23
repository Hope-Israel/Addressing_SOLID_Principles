package solved;

public class ISP {
    interface EmailNotification {
        void sendEmail(String recipient, String message);
    }

    interface TextNotification {
        void sendText(String phoneNumber, String message);
    }
}
