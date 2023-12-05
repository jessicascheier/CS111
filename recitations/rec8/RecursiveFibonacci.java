package recitations.rec8;

public class RecursiveFibonacci {
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int result = fib(n);
        System.out.println(result);
    }
}