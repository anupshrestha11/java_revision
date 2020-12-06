package Sort.MergeSort;

import Sort.Sort;

public class MergeSort extends Sort {

    private int[] input;


    public MergeSort(int[] input) {
        this.input = input;
    }

    @Override
    public void sort() {
        this.mergeSort(this.input, 0, this.input.length - 1);
    }

    private int[] sort(int[] arr, int start, int right) {

        return arr;
    }

    @Override
    public int[] run() {
        this.sort();
        return this.input;
    }

    private void merge(int arr[], int left, int mid, int right) {

        int len1 = mid - left + 1;
        int len2 = right - mid;

        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        for (int i = 0; i < len1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < len2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        while (i < len1 && j < len2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private void mergeSort(int arr[], int start, int right) {
        if (start < right) {
            int mid = (start + right) / 2;
            this.mergeSort(arr, start, mid);
            this.mergeSort(arr, mid + 1, right);
            this.merge(arr, start, mid, right);
        }
    }

}
