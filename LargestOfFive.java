/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Jessica Scheier, jls772@scarletmail.rutgers.edu, jls772
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int largest = 0;
        if (a > b && a > c && a > d && a > e) {
            largest = a;
        } else if (b > a && b > c && b > d && b > e) {
            largest = b;
        } else if (c > a && c > b && c > d && c > e) {
            largest = c;
        } else if (d > a && d > b && d > c && d > e) {
            largest = d;
        } else if (e > a && e > b && e > c && e > d) {
            largest = e;
        }
        System.out.println(largest);
        // WRITE YOUR CODE HERE
    }
}