package Strings;

public class strStr {

     public static int sol(String haystack, String needle) {
        char[] hArray = haystack.toCharArray();
        char[] nArray = needle.toCharArray();
        for (int i = 0; i< hArray.length - needle.length()+1; i++){
            boolean same = true;
            for (int j = 0; same && j < nArray.length; j++) {
                if (hArray[i+j] != nArray[j])
                    same = false;
            }
            if (same)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println(sol("a", "a"));
        System.out.println(sol("sadbutsad", "sad"));
        System.out.println(sol("leetcode", "leeto"));
    }
}
