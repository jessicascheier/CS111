package recitations.rec9;

public class RecurPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(args[0]));
    }
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1)) {
                return isPalindrome(s.substring(i + 1, s.length() - 2));
            }
        }
        return false;
    }
}