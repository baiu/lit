public class Main {

    static int min = Integer.MAX_VALUE;
    static Integer prev = null;
    public static void main(String[] args) {
        TreeNode treeFromArray = TreeNode.createTreeFromArray(new Integer[]{4,2,6,1,3});
        System.out.println("Minimum Difference = " + getMinimumDifference(treeFromArray));
    }

    public static int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        System.out.println("in node value = " + root.val);

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, Math.abs(root.val - prev));
            System.out.println("min = " + min);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        System.out.println("out node value = " + root.val);
        return min;
    }
}