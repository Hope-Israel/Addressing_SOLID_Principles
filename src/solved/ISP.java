package solved;

//This violation is solved because each notification interface is no forced implementation
//'ThisMessagingService' can now implement 1 or 2 notification services instead of all 3 if needed.
//The interfaces have also been separated and are only responsible for specific notifications each
public class ISP {
    //defining interfaces for email, text, and push notifications
    interface EmailNotification {
        void sendEmail(String recipient, String message);
    }

    interface TextNotification {
        void sendText(String phoneNumber, String message);
    }

    interface PushNotification {
        void sendPushNotification(String deviceId, String message);
    }

    //Define ThisMessagingService that implements notifications
    class ThisMessagingService implements EmailNotification, TextNotification, PushNotification{
        @Override
        public void sendEmail(String recipient, String message){
        }
        @Override
        public void sendText(String phoneNumber, String message){
        }
        @Override
        public void sendPushNotification(String deviceId, String message){
        }
    }
}
