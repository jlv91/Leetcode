package Arrays;
public class RemoveDuplicate {
    // nums is sorted!
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k+=1;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + k);
        System.out.print("Array elements after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}