package hw8.payment;

import hw8.channels.NotificationChannel;

public abstract class Payment {
    private NotificationChannel notifyChannel;

    protected Payment(NotificationChannel channel) {
        notifyChannel = channel;
    }

    protected void sendNotification(String msg) {
        notifyChannel.sendNotification(msg);
    }
}
