package hw8.channels;

public class SmsChannel implements NotificationChannel {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sent SMS: \"" + msg + "\"");
    }

}
