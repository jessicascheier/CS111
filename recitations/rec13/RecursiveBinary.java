package recitations.rec13;

public class RecursiveBinary {
    public static int binarySearch(int[] arr, int target) {
        return recurBinarySearch(arr, target, 0, arr.length);
    }
    public static int recurBinarySearch(int[] arr, int x, int left, int right) {
        if (left <= right && left <= arr.length - 1) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return recurBinarySearch(arr, x, left, mid - 1);
            } else {
                return recurBinarySearch(arr, x, mid + 1, right);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int x = Integer.parseInt(args[0]);
        System.out.println(binarySearch(arr, x));
    }
}