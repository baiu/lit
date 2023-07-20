import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        TreeNode treeFromArray = TreeNode.createTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        System.out.println(averageOfLevels(treeFromArray));
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(List.of(root));
        List<Double> results = new ArrayList<>();
        while (q.size() > 0) {
            double levelBreadth = q.size();

            double levelSum = computeLevelSumAndFillNext(q, levelBreadth);

            double averageOfLevel = levelSum / levelBreadth;
            results.add(averageOfLevel);
        }
        return results;
    }

    private static double computeLevelSumAndFillNext(Queue<TreeNode> q, double levelBreadth) {
        double levelSum = 0;
        for (int i = 0; i < levelBreadth; i++) {
            TreeNode curr = q.poll();
            levelSum += curr.val;

            fillNexLevel(q, curr);

        }
        return levelSum;
    }

    private static void fillNexLevel(Queue<TreeNode> q, TreeNode curr) {
        // if exists from left to right
        if (curr.left != null) {
            q.offer(curr.left);
        }
        if (curr.right != null) {
            q.offer(curr.right);
        }
    }
}