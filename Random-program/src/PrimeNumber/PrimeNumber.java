package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> generatePrimeNumbers(int limit) {
        List<Integer> primeList = new ArrayList<Integer>();
        for (int i = 2; i < limit; i++) {
            if ( i != 2 && i % 2 == 0) {
                continue;
            }
            boolean state = true;
            for (int j = 0; j < primeList.size() / 2; j++) {
                if (i % primeList.get(j) == 0) {
                    state = false;
                }
            }
            if (state) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumber().generatePrimeNumbers(15));
    }
}
