package recitations.rec9;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram(args[0], args[1]));
    }
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // boolean status = false;
        for (int i = 0; i < str1.length(); i++) {
            char letter = str1.charAt(i);
            int index = str2.indexOf(letter);
            if (str2.indexOf(letter) == -1) {
                return false;
            } else {
                String before = str2.substring(0, index);
                String after = str2.substring(index + 1);
                str2 = before + after;
            }
        }
        return true;
    }
}