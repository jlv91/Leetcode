package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new  int[2];
        Map<Integer, Integer> set_nums = new HashMap<>();
        
        for (int i = 0; i <nums.length; i++) {
            set_nums.put(nums[i], i);
        }
        for (int i = 0; i <nums.length; i++) {
            Integer k = set_nums.get(target - nums[i]);
            if (k != null && k != i) {
                result[0] = i;
                result[1] = k;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println();
        int[] result =  twoSum(nums, 6);
        System.out.println("" + result[0] + "-" + result[1]);
    }
}
