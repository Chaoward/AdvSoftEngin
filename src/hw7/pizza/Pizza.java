package hw7.pizza;

public class Pizza {
    private Topping[] toppings;
    private String chain;
    private Size size;


    public Pizza(String chain, Size size, Topping[] toppings) {
        this.toppings = toppings;
        this.chain = chain;
        this.size = size;
    }


    public void eat() {
        System.out.println(
            "==== " + chain + " =====\n" +
            "Size: " + size);
        System.out.println("Toppings:");
        for (Pizza.Topping top : toppings) {
            System.out.println(" - " + top);
        }
    }


    public Topping[] getToppings() {
        return toppings;
    }

    public String getChain() {
        return chain;
    }

    public Size getSize() {
        return size;
    }



    public enum Topping {
        PEPPERONI,
        SAUSAGE,
        MUSHROOMS,
        BACON,
        ONIONS,
        EXTRA_CHEESE,
        PEPPERS,
        CHICKEN,
        OLIVES,
        SPINACH,
        TOMATO_BASIL,
        BEEF,
        HAM,
        PESTO,
        SPICY_PORK,
        HAM_PINEAPPLE
    }

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }
}
