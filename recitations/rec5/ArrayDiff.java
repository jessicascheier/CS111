package recitations.rec5;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] n = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            n[i] = Integer.parseInt(args[i]);
        }
        int nlen = n.length;
        int smallest = n[0];
        int largest = n[0];
        for (int i = 0; i < nlen; i++) {
            if (n[i] < smallest) {
                smallest = n[i];
            }
            if (n[i] > largest) {
                largest = n[i];
            }
        }
        System.out.println(largest - smallest);
    }
}