package decorator_dobavitcheto;

public class Shop {

    public static void main(String[] args) {
        Milk milk = new Milk(50);

        Product milkDiscount = new MilkDiscount(milk);
        Product milkDiscount2 = new MilkDiscount(new MilkDiscount(milk));

        System.out.println(milk.getPrise());
        System.out.println(milkDiscount.getPrise());
        System.out.println(milkDiscount2.getPrise());
    }
}
