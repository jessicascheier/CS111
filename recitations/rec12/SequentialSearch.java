package recitations.rec12;

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
        int[] arr = {15, 2, 8, 1, 17, 5};
        System.out.println(sequentialSearch(arr, 1));
    }
}

//binary search
// {1, 3, 5, 6, 12, 19, 20, 25, 28, 33}
// {1, 3, 5, 6}
// {5, 6}
// {6}
//high 33 - 6 - 6 - 6
//low 1 - 1 - 5 - 6    ----- ans: -1
//mid 12 - 3 - 5 - 6

//insertion sort, move left until it is greater than the number before it
// {15, 2, 8, 1, 17, 5}
// {2, 15, 8, 1, 17, 5}
// {2, 8, 15, 1, 17, 5}
// {2, 8, 1, 15, 17, 5}
// {2, 1, 8, 15, 17, 5}
// {1, 2, 8, 15, 17, 5}
// {1, 2, 8, 15, 5, 17}
// {1, 2, 8, 5, 15, 17}
// {1, 2, 5, 8, 15, 17} 
//n + n -1 + n -2... (worse case - n^2)
//best case already sorted so just n cuz ur not doing any swaps

//selection sort, keep lowest as you search, then when you reach end put it at the right place
// {15, 2, 8, 1, 17, 5}
// {1, 2, 8, 15, 17, 5}
// {1, 2, 5, 15, 17, 8}
// {1, 2, 5, 8, 17, 15}
// {1, 2, 5, 8, 15, 17}
//worse case n^2
//best case n^2
//order doesn't matter you're doing same number of comparisons no matter what
//you don't know you have the minimum until you compare it with all the others