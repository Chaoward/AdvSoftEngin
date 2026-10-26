package hw8.decorator.order;

public class GoldOrder extends MembershipOrder {

    public GoldOrder(CustomerOrder order) {
        super(order);
        this.DISCOUNT = 0.18f;
    }

}
