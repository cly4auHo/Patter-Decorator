package decorator_dobavitcheto;

public class MilkDiscount extends Decorator {

    @Override
    public double getPrise() {
        return this.product.getPrise() * 0.8;
    }

    protected MilkDiscount(Product product) {
        super(product);
    }

}
