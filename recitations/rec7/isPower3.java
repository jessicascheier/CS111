package recitations.rec7;

public class isPower3 {
    public static boolean power(int a) {
        int n = 0;
        while (n < a) {
            if (Math.pow(3, n) == a) {
                return true;
            }
            n++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(power(27));
    }
}