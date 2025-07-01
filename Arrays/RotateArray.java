package Arrays;
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // ensure k <= nums.length
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // switch start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println("-------");
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
