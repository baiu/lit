public class Main {

    public static void main(String[] args) {
        System.out.println(isSymmetric(TreeNode.createTreeFromArray(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricNodes(root.left, root.right);
    }

    public static boolean isSymmetricNodes(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSymmetricNodes(left.left, right.right) && isSymmetricNodes(left.right, right.left);
    }
}