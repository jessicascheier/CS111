import assignments.a6.StdOut;

public class SquarePlus1 {
    public static double sqrtpl(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        return (Math.sqrt(c) + 1);
    }

    public static void main(String[] args) {
        double[] a = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Double.parseDouble(args[i]);
        }
        for (int i = 0; i < a.length; i++) {
            StdOut.println(sqrtpl(a[i]));
        }
    }
}