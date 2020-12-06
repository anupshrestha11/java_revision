public class BasicOperation {
    public int add(int a, int b) {
        return (a + b);
    }

    public int subtract(int a, int b) {
        return (a - b);
    }

    public int multiply(int a, int b) {
        return (a * b);
    }

    public float divide(int a, int b) {
//        * Type Casting int to float
        return ((float) a) / ((float) b);
    }

    public int modules(int a, int b) {
        return (a % b);
    }

    public int increaseBy1(int a) {
        return (++a);
    }

    public int decreaseBy1(int a) {
        return (--a);
    }

    public int rand(int value) {
        return (int) Math.round(Math.random() * value);
    }

    public boolean max(int a, int b) {
        return a > b;
    }

    public boolean min(int a, int b) {
        return a < b;
    }

    public void operations() {
        int a = this.rand(10);
        int b = this.rand(10);

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("add : " + add(a, b));
        System.out.println("subtract : " + subtract(a, b));
        System.out.println("multiply : " + multiply(a, b));
        System.out.println("divide : " + divide(a, b));
        System.out.println("modules : " + modules(a, b));
        System.out.println("increase By 1 : " + increaseBy1(a));
        System.out.println("decrease By 1 : " + decreaseBy1(a));
        System.out.println("Max : " + (max(a, b) ? a : b));
        System.out.println("Min : " + (min(a, b) ? a : b));
    }


    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();
        basicOperation.operations();
    }
}
