package assignments.a4;
/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Jessica Scheier, jls772@scarletmail.rutgers.edu, jls772
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 2 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		int[] arr = new int[args.length]; //create array of length of n command line args
		int i = 0; 
		int n = Integer.parseInt(args[i]);
		boolean duplicate = false;

		while (i < args.length) { //loop through and assign command line args to array
			n = Integer.parseInt(args[i]);
			arr[i] = n;
			//System.out.println(arr[i] + " ");
			i++;
		}
		for (int j = 0; j < arr.length; j++) { //loop through twice to compare values as they go through the array
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k]) {
					duplicate = true;
				}
			}
		}
		System.out.println(duplicate);
	}
}