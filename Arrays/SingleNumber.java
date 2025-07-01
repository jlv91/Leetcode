package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            if (numCounts.containsKey(num)) {
                numCounts.put(num, 2);
            }
            else {
                numCounts.put(num, 1);
            }
        }
        var it = numCounts.entrySet().iterator();
        while (it.hasNext()) {
            var entry = it.next();
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static int singleNumberXOR(int[] nums) {
        // a^a = 0 a^0=a 
        int result = 0;
        for (int num : nums) {
            result = result^num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println();
        System.out.println(singleNumberXOR(nums));
    }
}

