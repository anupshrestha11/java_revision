public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition("Tomato", 0.27);
        hamburger.addHamburgerAddition("Lettuce", 0.75);
        hamburger.addHamburgerAddition("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition("Egg", 5.43);
        healthyBurger.addHealthAddition("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition("hh",1212);
        System.out.println("Total Healthy Burger price is " + deluxeBurger.itemizeHamburger());

    }
}
