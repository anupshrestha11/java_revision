import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("ball");
        items.add("ball");

        //only can be do on existing list item
//        items.set(2, "heaven");
        System.out.println(items);

        // get index of item from list
        System.out.println(items.indexOf("ball"));

        // remove item from list using object
        items.remove("ball");
        System.out.println(items);

        // remove item from list using index
        items.remove(0);
        System.out.println(items);

        items.add("ball");
        items.add("ball");
        items.set(0, "hell");

        System.out.println(items);

        // clear list
        items.clear();
        System.out.println(items);

        Scanner sc = new Scanner(System.in);

        while(items.size() < 5){
            System.out.println("Enter an item");
            items.add(sc.nextLine());
            System.out.println(items);
        }




    }

}
