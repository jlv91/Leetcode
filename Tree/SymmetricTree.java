public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
            && isSymmetric(t1.left, t2.right)
            && isSymmetric(t1.right, t2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(2);
        root.left = l2;
        root.right = r2;
        TreeNode l2l3 = new TreeNode(3);
        TreeNode l2r3 = new TreeNode(4);
        l2.left = l2l3;
        l2.right = l2r3;

        TreeNode r2l3 = new TreeNode(4);
        TreeNode r2r3 = new TreeNode(3);
        r2.left = r2l3;
        r2.right = r2r3;

        System.out.println();
        System.out.println(new SymmetricTree().isSymmetric(root));

    }
}
