public class Main {

    public static void main(String[] args) {
        TreeNode p = TreeNode.createTreeFromArray(new Integer[]{1, 2, 3});
        TreeNode q = TreeNode.createTreeFromArray(new Integer[]{1, 2, 3});
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}