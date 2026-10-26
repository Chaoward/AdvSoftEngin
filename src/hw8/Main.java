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
        cashEmail.sendNotification("Cash Accepted.");
        cashSms.sendNotification("Cash Accepted.");
        
        System.out.println("\n===== BRIDGE Part 2 =====");
        BitcoinPayment bitEmail = new BitcoinPayment(new EmailChannel());
        BitcoinPayment bitSms = new BitcoinPayment(new SmsChannel());

        bitEmail.sendNotification("Bitcoin Received.");
        bitSms.sendNotification("Bitcoin Received.");

        System.out.println("\n===== BRIDGE Part 3 =====");
        BitcoinPayment bitPush = new BitcoinPayment(new PushChannel());
        OnlinePayment onlinePush = new OnlinePayment(new PushChannel());

        bitPush.sendNotification("Bitcoin Received.");
        onlinePush.sendNotification("Online Payment Confirmed.");
    }
}
