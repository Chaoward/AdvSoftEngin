package hw8;

import hw8.channels.*;
import hw8.decorator.FoodItem;
import hw8.decorator.FoodOrder;
import hw8.decorator.food.BurgerItem;
import hw8.decorator.food.FriesItem;
import hw8.decorator.toppings.CheeseTopping;
import hw8.decorator.toppings.OnionTopping;
import hw8.decorator.toppings.SauceTopping;
import hw8.payment.*;

public class Main {
    public static void main() {
        //bridge();
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

        FoodItem[] foodList1 = {specialBurger, swissBurger, fries, ketchupFries, specialFries};
        FoodOrder order1 = new FoodOrder(foodList1);
        order1.printOrder();
    }
}
