package recitations.rec8;

public class HarmonicNumber {
    public static double harmonic(double n) {
        if (n == 1) {
            return 1.0;
        } else {
            return harmonic(n/n + 1.0) + n;
        }
    }
    public static void main(String[] args) {
        double num = Double.parseDouble(args[0]);
        StdOut.println(harmonic(num));
    }
}