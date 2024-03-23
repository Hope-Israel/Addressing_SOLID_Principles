package violated;

//This is a representation of the Interface Segregation Principle because when a client uses this service, it
//requires the usage of all three methods even when it may not be necessary or required.
public class ISP {

//Interface called Messaging Service
    interface MessagingService {

        //methods to send email, text, and push notifications
        void sendEmail(String recipient, String message);
        void sendText(String phoneNumber, String message);
        void sendPushNotification(String deviceId, String message);
    }


    //class named thisMessagingService that implements Messaging service
    class ThisMessagingService implements MessagingService {

        //implementation of methods
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
