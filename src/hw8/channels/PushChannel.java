package hw8.channels;

public class PushChannel implements NotificationChannel {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Pushed Notification: \"" + msg + "\"");
    }

}
