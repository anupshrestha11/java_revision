import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListClass {

    public static void main(String[] args) {
        LinkedList<String> route = new LinkedList<>();

//        route.add("Kaushaltar");
//        route.add("Lokanthali");
//        route.add("Jadibuti");
//        route.add("Koteswor");
//        route.add("tinkune");
//        route.add("Baneshwor");
//
//        printList(route);
//
//        // add between the list kaushaltar and lokanthali
//        route.add(1, "Hell");
//        // add between the list koteswor and tinkune
//        route.add(5, "Heaven");
//        printList(route);
//
//        // remove hell from linkedlist
//        route.remove(1);
//        printList(route);


        addInOrder(route, "Kaushaltar");
        addInOrder(route, "Lokanthali");
        addInOrder(route, "Jadibuti");
        addInOrder(route, "Koteswor");
        addInOrder(route, "Tinkune");
        addInOrder(route, "Baneshwor");

        printList(route);

        addInOrder(route, "Kaushaltar");
        addInOrder(route, "Heaven");

        printList(route);

        visit(route);


    }

    private static void printList(LinkedList<String> linkedList) {

//        Iterator<String> i = linkedList.iterator();
//        while (i.hasNext()){
//            System.out.println("Now Visiting "+ i.next());
//        }

        //same as above but without iterator
        for (String s : linkedList) {
            System.out.println("Now route is " + s);
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {

            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already exist in the route");
                return false;
            } else if (comparison > 0) {
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }

        }
        listIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> locations) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = locations.listIterator();

        if (locations.isEmpty()) {
            System.out.println("No locations to iterate");
        } else {
            System.out.println("Now route is " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0 -> {
                    System.out.println("Holiday (Vacation) Over");
                    quit = true;
                }
                case 1 -> {
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now route is " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                }
                case 2 -> {
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now route is " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                }
                case 3 -> printMenu();
                default -> {
                    System.out.println("");
                    System.out.println("Invalid Action : "+ action );
                    System.out.println("");
                    printMenu();
                }
            }
        }

    }

    public static void printMenu() {
        System.out.println("""
                Availabel Actions:
                press\s
                0 - to quit
                1 - goto next location
                2 - goto previous location
                3 - print menu options""");

    }

}
