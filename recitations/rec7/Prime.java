package recitations.rec7;

public class Prime {
    public static boolean isPrime(int a) {
        int factor = 1;
        while (factor <= a) {
            if (((a%factor==0) && (factor==1)) || ((a%factor==0) && (factor==a))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}