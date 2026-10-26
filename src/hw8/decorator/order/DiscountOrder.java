package hw8.decorator.order;

public abstract class DiscountOrder implements CustomerOrder {
    protected CustomerOrder order;

    protected DiscountOrder(CustomerOrder order) {
        this.order = order;
    }
}
