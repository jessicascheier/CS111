package assignments.a8;
/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Jessica Scheier, jls772, jls772@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n == 0) {
            return original;
        } else {
            n--;
            return original + appendNTimes(original, n);
        }
	// WRITE YOUR CODE HERE
    }

    public static void main (String[] args) {
        System.out.println(appendNTimes("cat", 0));
	// WRITE TEST CASES HERE to test your method
    }
}
