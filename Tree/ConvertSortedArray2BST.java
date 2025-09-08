public class ConvertSortedArray2BST {
    public TreeNode sortedArrayToBST(int[] nums) {
         return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if  (start > end ) return null;
        int m = start + (end - start) / 2 ;

         return new TreeNode(nums[m], sortedArrayToBST(nums, start, m - 1), sortedArrayToBST(nums, m + 1, end));
    }
}
