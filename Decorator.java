package decorator_dobavitcheto;

public abstract class Decorator implements Product {

    final Product product;

    protected Decorator(Product product) {
        this.product = product;
    }

}
