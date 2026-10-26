package hw8;

import hw8.channels.*;
import hw8.payment.*;

public class Main {
    public static void main() {
        bridge();
    }

    public static void bridge() {
        System.out.println("===== BRIDGE Part 1 =====");
        OnlinePayment onlineEmail = new OnlinePayment(new EmailChannel());
        OnlinePayment onlineSms = new OnlinePayment(new SmsChannel());
        CashOnDeliveryPayment cashEmail = new CashOnDeliveryPayment(new EmailChannel());
        CashOnDeliveryPayment cashSms = new CashOnDeliveryPayment(new SmsChannel());

        onlineEmail.sendNotification("Online Payment Confirmed.");
        onlineSms.sendNotification("Online Payment Confirmed.");
        cashEmail.sendNotification("Cash Payment Confirmed.");
        cashSms.sendNotification("Cash Payment Confirmed.");
        
    }
}
