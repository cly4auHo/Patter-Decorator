package decorator_dobavitcheto;

public class Milk implements Product {

    private final double prise;

    Milk(final int prise) {
        this.prise = prise;
    }

    @Override
    public double getPrise() {
        return this.prise;
    }
}
