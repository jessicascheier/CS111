package recitations.rec8;

public class Tribonacci {
    public static void fill(int[] arr, int index) {
        arr = new int[index + 1];
        arr[index - 1] = (fib(index));
        for (int i = 0; i < arr.length; i++) {
            arr[index - 1] = (fib(index));
            System.out.print(arr[index - 1] + " ");
        }
    }
    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return 1;
        }
        return (fib(n - 1) + fib(n - 2) + fib(n - 3));
    }
    public static void main(String[] args) {
        int index = Integer.parseInt(args[0]);
        int[] arr = new int[index];
        fill(arr, index);
    }
}