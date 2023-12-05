package recitations.rec9;

public class LongestSubsequence {
    public static void main(String[] args) {
        System.out.println(subseq(args[0]));
    }
    public static String subseq(String s) {
        String longest = new String(""); 
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                low = i;
                longest = longest + s.charAt(i) + s.charAt(i + 1);
            } else {
                high = i;
            }
        }
        System.out.println(s.substring(low, high));
        return longest;
    }
}