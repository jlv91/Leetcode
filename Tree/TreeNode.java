
public class TreeNode {
      int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }

         public static TreeNode build(Integer[] nums) {
            TreeNode root = null;
            if (nums == null || nums.length == 0) return root;
            int i = 0;
            root = new TreeNode(nums[i]);
            TreeNode cur = root;
            TreeNode left = null;
            TreeNode right = null;
            while (i < nums.length) {
                i++;
                if (i < nums.length && nums[i] != null) {
                    left = new TreeNode(nums[i]);
                    cur.left = left;
                }
                else
                    left = null;
                i++;
                if (i < nums.length && nums[i] != null) {
                    right = new TreeNode(nums[i]);
                    cur.right = right;
                }

            }
        return root;
    }
 }
 