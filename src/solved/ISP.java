package solved;

public class ISP {
    interface EmailNotification {
        void sendEmail(String recipient, String message);
    }

    interface TextNotification {
        void sendText(String phoneNumber, String message);
    }

    interface PushNotification {
        void sendPushNotification(String deviceId, String message);
    }

    class ThisMessagingService implements EmailNotification, TextNotification, PushNotification{
        @Override
        public void sendEmail(String recipient, String message){
        }
        @Override
        public void sendText(String phoneNumber, String message){
            
        }
    }
}
