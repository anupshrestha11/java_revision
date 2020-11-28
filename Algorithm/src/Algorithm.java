import Sort.BubbleSort.BubbleSort;
import Sort.MergeSort.MergeSort;

import java.util.Arrays;
import java.util.Collections;

public class Algorithm {

    //* generate array on integer between the range of 0 to 10
    public static int[] generateArray(int length) {
        int[] arr = new int[length];
        Integer[] intArray = new Integer[length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        Collections.shuffle(Arrays.asList(intArray));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = intArray[i];
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = generateArray(10);
        System.out.println("Orginal Array : " + Arrays.toString(arr));

        //* BubbleSort
        BubbleSort bubbleSort = new BubbleSort(arr);
        System.out.println("Bubble Sort Result : " + Arrays.toString(bubbleSort.run()));
        //* End of BubbleSort

        arr = generateArray(10);
        System.out.println("Orginal Array : " + Arrays.toString(arr));

        //* MergeSort
        MergeSort mergeSort = new MergeSort(arr);
        System.out.println("Merge Sort Result : " + Arrays.toString(mergeSort.run()));
        //* End of BubbleSort



    }
}
