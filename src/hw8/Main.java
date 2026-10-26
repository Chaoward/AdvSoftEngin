package hw8;

import hw8.channels.*;
import hw8.decorator.*;
import hw8.decorator.food.*;
import hw8.decorator.order.*;
import hw8.decorator.toppings.*;
import hw8.payment.*;

public class Main {
    public static void main() {
        bridge();
        System.out.println();
        decorator();
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


    public static void decorator() {
        BurgerItem burger = new BurgerItem("Hamburger", 5);
        FriesItem fries = new FriesItem("Fries", 2);

        CheeseTopping cheeseBurger = new CheeseTopping("Cheese", 1, burger);
        OnionTopping onionCheeseBurger = new OnionTopping("Onion", 1, cheeseBurger);
        SauceTopping specialBurger = new SauceTopping("House Special", 2, onionCheeseBurger);
        CheeseTopping swissBurger = new CheeseTopping("Swiss Cheese", 1, burger);

        SauceTopping ketchupFries = new SauceTopping("Ketchup", 0, fries);
        SauceTopping specialFries = new SauceTopping("House Special", 2, fries);

        FoodItem[] foodList = {specialBurger, swissBurger, fries, ketchupFries, specialFries};
        FoodOrder order = new FoodOrder("Regular Order", foodList);
        order.printOrder();

        order.name = "Member Order";
        MembershipOrder memberOrder = new MembershipOrder(order);
        memberOrder.printOrder();

        order.name = "Gold Member Order";
        GoldOrder goldOrder = new GoldOrder(order);
        goldOrder.printOrder();
    }
}
