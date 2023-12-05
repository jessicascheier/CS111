package recitations.rec5;

public class NthColumn {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 0, 1}, 
            {1, 1, 0, 1}, 
            {1, 0, 1, 0}
        };
        int[] arr2 = new int[4];
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < 3; i++) {
            arr2[i] = arr[i][n];
            System.out.println(arr2[i]);
        }
    }
}