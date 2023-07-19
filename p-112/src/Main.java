import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        TreeNode tree = TreeNode.createTreeFromArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});

        System.out.println(hasPathSum(tree, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
            hasPathSum(root.right, targetSum - root.val);
    }

}