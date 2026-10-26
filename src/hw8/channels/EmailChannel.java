package hw8.channels;

public class EmailChannel implements NotificationChannel {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sent Email: \"" + msg + "\"");
    }
    
}
