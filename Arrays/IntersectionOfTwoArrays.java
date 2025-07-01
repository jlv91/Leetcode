package Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums1) {
            var c = m.getOrDefault(num, 0);
            m.put(num, c+1);
        }
        for (int num : nums2) {
            var c = m.getOrDefault(num, 0);
            if (c != 0) {
                result.add(num);
                m.put(num, c-1);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[]  nums2 = {9,4,9,8,4};
        System.out.println();
        for (int n : intersect(nums1, nums2)) {
            System.out.println(n);
        }
    }
}
