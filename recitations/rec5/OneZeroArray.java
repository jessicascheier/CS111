package recitations.rec5;

public class OneZeroArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int ones = 0;
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Math.random() < 0.5) {
                    arr[i][j] = 0;
                    zeroes++;
                } else if (Math.random() >= 0.5) {
                    arr[i][j] = 1;
                    ones++;
                }
            }
        }
        System.out.println("There were " + ones + " ones and " + zeroes + " zeroes.");

    }
}