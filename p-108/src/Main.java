public class Main {

    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    private static TreeNode createBST(int nums[], int leftIdx, int rightIdx) {
        if (leftIdx > rightIdx) {
            return null;
        }
        int midIdx = leftIdx + (rightIdx - leftIdx) / 2;
        TreeNode root = new TreeNode(nums[midIdx]);
        root.left = createBST(nums, leftIdx, midIdx - 1);
        root.right = createBST(nums, midIdx + 1, rightIdx);
        return root;
    }
}