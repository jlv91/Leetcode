package Strings;

public class ValidPalindrome {
        public static boolean isPalindrome(String s) {
            int l = 0;
            char[] array = new char[s.length()];
            for (char c : s.toLowerCase().toCharArray()) {
                if ((c >= 65 && c <= 90) ||
                    (c >= 97 && c <= 122) ||
                    (c >= 48 && c <= 57)) {
                    array[l++] = c;
                }
            }
            int start = 0;
            int end = l - 1;
            while (start < end) {
                if (array[start] != array[end])
                    return false;
                start++;
                end--;
            }

            return true;
        }
        public static void main(String[] args) {
            System.out.println();
            System.out.println(isPalindrome("0P"));
            System.out.println(isPalindrome("race a car"));
            System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
            System.out.println(isPalindrome(" "));
                }
    
}
