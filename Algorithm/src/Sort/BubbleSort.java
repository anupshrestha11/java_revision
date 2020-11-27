package Sort;

public class BubbleSort implements Sort {

    //* input array
    private int[] input;

    //* Constructor of BubbleSort without params
    public BubbleSort() {
    }

    //* Constructor of BubbleSort with params
    public BubbleSort(int[] input) {
        this.input = input;
    }

    //* Overriding method of interface class Sort without params
    @Override
    public void sort() {
        int n = this.input.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (this.input[i] > this.input[k]) {
                    this.swapNumbers(i, k);
                }
            }
        }
    }

    //* Overriding method of interface class Sort with params
    @Override
    public void sort(int[] input) {
        this.input = input;
        this.sort();
    }

    //* Method to Swap integer element of input array
    private void swapNumbers(int i, int j) {
        int temp = this.input[i];
        this.input[i] = this.input[j];
        this.input[j] = temp;
    }

    //* Overriding method of interface class Sort without params
    @Override
    public int[] run() {
        this.sort();
        return this.input;
    }

    //* Overriding method of interface class Sort with params
    @Override
    public int[] run(int[] input) {
        this.input = input;
        return this.run();
    }

    //* Getter method of input
    public int[] getInput() {
        return input;
    }

    //* Setter method of input
    public void setInput(int[] input) {
        this.input = input;
    }
}
