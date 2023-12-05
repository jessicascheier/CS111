package recitations.rec5;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 3, 2};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }
}