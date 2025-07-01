package Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Collection<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        int end = Collections.min(sizes);
        if (end == 0) return "";

        for (int i = 0; i < end; i++) {
            boolean same = true;
            char c = strs[0].charAt(i);
            for (int j = 1; same && j< strs.length; j++) {
                if (c != strs[j].charAt(i))
                    same = false;
            }
            if (same == false)
                return strs[0].substring(0, i);
        }
        return strs[0].substring(0, end);
    }

        public static void main(String[] args) {
        System.out.println();
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"a", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
