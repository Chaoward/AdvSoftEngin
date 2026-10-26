package hw8;

import hw8.channels.*;
import hw8.payment.*;

public class Main {
    public static void main() {
        bridge();
    }

    public static void bridge() {
        OnlinePayment online = new OnlinePayment(new EmailChannel());
        online.sendNotification("Online Payment Confirmed.");
    }
}
