package hw8.decorator.order;

public class MembershipOrder extends DiscountOrder {
    protected float DISCOUNT = 0.1f;

    public MembershipOrder(CustomerOrder order) {
        super(order);
    }

    @Override
    public int getTotalCost() {
        return (int)(order.getTotalCost() * (1f - DISCOUNT));
    }

    @Override
    public void printOrder() {
        order.printOrder();
        System.out.println("DISCOUNTED TOTAL : $" + getTotalCost());
    }
}
