public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTreeFromArray(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[array.length];

        // Create all tree nodes
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                nodes[i] = new TreeNode(array[i]);
            }
        }

        // Connect parent and child nodes
        for (int i = 0; i < array.length; i++) {
            if (nodes[i] != null) {
                int leftIndex = 2 * i + 1;
                int rightIndex = 2 * i + 2;

                if (leftIndex < array.length) {
                    nodes[i].left = nodes[leftIndex];
                }

                if (rightIndex < array.length) {
                    nodes[i].right = nodes[rightIndex];
                }
            }
        }

        return nodes[0]; // Return the root node
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(this, sb);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null");
            return;
        }

        sb.append(node.val);
        sb.append(", ");

        buildString(node.left, sb);
        sb.append(", ");

        buildString(node.right, sb);
    }
}
