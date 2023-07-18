public class Main {

    public static void main(String[] args) {
        TreeNode tree = TreeNode.createTreeFromArray(new Integer[]{1,null,2});
        System.out.println(maxDepth(tree));
    }

    public static int maxDepth(TreeNode root) {
        // Base Condition
        if (root == null) {
            return 0;
        }
        // Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // Induction
        return Math.max(left, right) + 1;
    }

}