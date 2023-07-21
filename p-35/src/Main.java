public class Main {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        return findTargetIdx(nums, target, 0, nums.length - 1);
    }

    private static int findTargetIdx(int[] nums, int target, int leftIdx, int rightIdx) {
        if (leftIdx > rightIdx) {
            return leftIdx;
        }

        int mid = leftIdx + (rightIdx - leftIdx) / 2;
        if (target == nums[mid]) {
            return mid;
        }

        if (target < nums[mid]) {
            return findTargetIdx(nums, target, leftIdx, mid - 1);
        } else {
            return findTargetIdx(nums, target, mid + 1, rightIdx);
        }
    }

    private int searchInsertIterate(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}