import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private final String name;
    private final String meat;
    private final double price;
    private final String breadRollType;

    private List<String> additionalName = new ArrayList<>();
    private List<Double> additionalPrice = new ArrayList<>();


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition(String item, double price) {
        this.additionalName.add(item);
        this.additionalPrice.add(price);
    }


    public double itemizeHamburger() {

        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        for (int i = 0; i < this.additionalName.size(); i++) {
            hamburgerPrice += this.additionalPrice.get(i);
            System.out.println("Added " + this.additionalName.get(i) + " for an extra " + this.additionalPrice.get(i));
        }

        return hamburgerPrice;
    }

}
