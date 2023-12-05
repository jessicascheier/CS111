/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Jessica Scheier, jls772@scarletmail.rutgers.edu, jls772
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long number = Long.parseLong(args[0]);
        long copy = number/10;
        long sum1 = 0;
        long sum2 = 0;
        long sum3 = 0;
        while (number!=0) {
            sum1 = sum1 + number%10; //gets digit
            number = number/100; //skips to next digit
        }
        while (copy!=0) {
            sum2 = sum2 + copy%10; //gets digit, different start point
            copy = copy/100; //skips to next digit
        }
        sum1 = sum1%10;
        sum2 = sum2%10;
        sum2 = sum2*3;
        sum2 = sum2%10;
        sum3 = sum1 + sum2;
        sum3 = sum3%10;
        System.out.println(sum3);
    }
}