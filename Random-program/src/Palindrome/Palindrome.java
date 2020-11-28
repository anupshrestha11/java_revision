package Palindrome;

public class Palindrome {
    public boolean checkPalindrome(String input) {
        input = input.toLowerCase();
        StringBuilder str = new StringBuilder(input);
        str.reverse();
        return input.equalsIgnoreCase(str.toString());
    }

    public static void main(String[] args) {
        String input = "bob";
        System.out.println(input + " is " + (new Palindrome().checkPalindrome(input) ? "" : "not ") + "Palindrome");
        input = "anup";
        System.out.println(input + " is " + (new Palindrome().checkPalindrome(input) ? "" : "not ") + "Palindrome");
    }
}
