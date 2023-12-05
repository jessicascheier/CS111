package recitations.rec5;

public class InplaceReverse {
    public static void main(String[] args) {
        int[] n = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            n[i] = Integer.parseInt(args[i]);
        }
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(n[i] + ", ");
        }
    }
}