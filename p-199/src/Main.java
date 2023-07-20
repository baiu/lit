import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        TreeNode treeFromArray = TreeNode.createTreeFromArray(new Integer[]{1, 2, 3, null, 5, null, 4});
        System.out.println(rightSideView(treeFromArray));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> results = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(List.of(root));

        while (!q.isEmpty()) {
            int levelBreadth = q.size();
            handleLevel(results, q, levelBreadth);
        }

        return results;
    }

    private static void handleLevel(List<Integer> results, Queue<TreeNode> q, int levelBreadth) {
        for (int i = 0; i < levelBreadth; i++) {

            TreeNode curr = q.poll();
            // add if is Right Side
            if (i == levelBreadth - 1) {
                results.add(curr.val);
            }

            fillNextLevelFromLeftToRight(q, curr);
        }
    }

    private static void fillNextLevelFromLeftToRight(Queue<TreeNode> q, TreeNode curr) {
        if (curr.left != null) {
            q.offer(curr.left);
        }

        if (curr.right != null) {
            q.offer(curr.right);
        }
    }
}