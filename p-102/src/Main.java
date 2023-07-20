import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println(levelOrder(TreeNode.createTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(List.of(root));

        while (!q.isEmpty()) {
            int levelBreadth = q.size();

            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelBreadth; i++) {

                TreeNode curr = q.poll();
                level.add(curr.val);

                fillNextLevel(curr, q);
            }

            results.add(level);
        }

        return results;
    }

    private static void fillNextLevel(TreeNode curr, Queue<TreeNode> q) {
        if (curr.left != null) {
            q.offer(curr.left);
        }

        if (curr.right != null) {
            q.offer(curr.right);
        }

    }
}