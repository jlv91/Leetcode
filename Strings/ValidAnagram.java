package Strings;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int [] freq_s = new int[26];
        for (char c : s.toCharArray()) {
            freq_s[c - 'a']++;
        }
        int [] freq_t = new int[26];
        for (char c : t.toCharArray()) {
            freq_t[c - 'a']++;
        }
        for (int i=0; i<freq_s.length; i++){
            if (freq_s[i] != freq_t[i])
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
