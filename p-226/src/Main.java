public class Main {

    public static void main(String[] args) {
        TreeNode tree = TreeNode.createTreeFromArray(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        System.out.println(tree);
        System.out.println(invertTree(tree));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;

        return root;
    }
}