package recitations.rec9;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(args[0]));
    }
    public static boolean isPalindrome(String s) {
        int n = s.length();
        boolean status = false;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ',') { // if punctuation, continue to next index
                continue;
            }
            if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(n - 1)) { // if they equal, continue and subtract from length to get next char from right
                status = true;
            } else {
                status = false;
                break;
            }
            n--;
        }
        return status;
    }
}