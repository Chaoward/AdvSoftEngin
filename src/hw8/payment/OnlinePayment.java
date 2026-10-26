package hw8.payment;

import hw8.channels.NotificationChannel;

public class OnlinePayment extends Payment {

    public OnlinePayment(NotificationChannel channel) {
        super(channel);
        this.typeName = "Online Payment";
    }

}
