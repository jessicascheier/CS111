package recitations.rec12;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int high = arr.length - 1;
        int low = 0;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12, 19, 20, 25, 28, 33};
        System.out.println(binarySearch(arr, 12));
    }
}