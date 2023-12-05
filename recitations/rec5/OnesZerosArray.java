package recitations.rec5;

public class OnesZerosArray {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 1, 0},
            {1, 1, 1, 0},
            {1, 0, 1, 1},
            {0, 1, 1, 0}
        };
        int ones = 0;
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zeroes++;
                } else if (arr[i][j] == 1) {
                    ones++;
                }
            }
        }
        System.out.println("There were " + ones + " ones and " + zeroes + " zeroes.");
    }
}