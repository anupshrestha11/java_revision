public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition("Chips", 2.75);
        super.addHamburgerAddition("Drink", 3.41);
    }

    @Override
    public void addHamburgerAddition(String item, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
