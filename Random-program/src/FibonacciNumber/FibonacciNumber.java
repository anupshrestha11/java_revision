package FibonacciNumber;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {
    public List<Integer> generateFibo(int limit){
        List<Integer> fibo = new ArrayList<Integer>();
        fibo.add(1);
        fibo.add(1);
        for (int i = 2; i <= limit; i++){
            fibo.add(fibo.get(i-2) + fibo.get(i-1));
        }
        return fibo;
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciNumber().generateFibo(50));
    }
}
