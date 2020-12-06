package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 100; i++){
            if (i % 3 == 0){
                output.append("Fizz");
            }
            if (i%5 == 0){
                output.append("Buzz");
            }
            System.out.println(i + " "+ output);
            output = new StringBuilder();
        }
    }
}
