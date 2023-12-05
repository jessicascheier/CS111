package recitations.rec5;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int alen = a.length;
        int blen = b.length;
        int[] temp = new int[alen + blen];
        for (int i = 0; i < 3; i++) {
            temp[i] = a[i];
            System.out.print(temp[i] + ", ");
        }
        for (int i = 0; i < 3; i++) {
            temp[i] = b[i];
            System.out.print(temp[i] + ", ");
        }
    }
}