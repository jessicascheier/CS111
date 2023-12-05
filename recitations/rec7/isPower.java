package recitations.rec7;

public class isPower {
    public static boolean power(int a) {
        int n = 1;
        /*while (n < a) {
            if (Math.pow(3, n) == a) {
                return true;
            }
            n++;
        }*/
        while (n < a) {
            n *= 3;
            if (n == a) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(power(27));
    }
}