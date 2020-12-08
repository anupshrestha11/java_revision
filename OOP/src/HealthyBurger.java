import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger {
    private List<String> healthyExtraName = new ArrayList<>();
    private List<Double> healthyExtraPrice = new ArrayList<>();

    public HealthyBurger( String meat, double price){
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition(String name, double price){
        this.healthyExtraName.add(name);
        this.healthyExtraPrice.add(price);
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        for (int i = 0; i < this.healthyExtraName.size(); i++) {
            hamburgerPrice += this.healthyExtraPrice.get(i);
            System.out.println("Added " + this.healthyExtraName.get(i) + " for an extra " + this.healthyExtraPrice.get(i));
        }
        return hamburgerPrice;
    }
}
