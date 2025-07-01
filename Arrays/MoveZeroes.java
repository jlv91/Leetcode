package Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                 k++;
            }
            
        }
        while (k < nums.length) {
            nums[k] = 0;
             k++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println();
        moveZeroes(nums);
        for (int n : nums)
            System.out.println(n);
    }
}
