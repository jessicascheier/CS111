package recitations.rec11;

public class SequentialSearch {
    public static int sequentialSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] arr = {15, 2, 8, 1, 17, 5};
        System.out.println(sequentialSearch(arr, x));
    }
}