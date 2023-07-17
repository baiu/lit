public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int resultIdx = 1;
        boolean newPair = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                if (newPair) {
                    nums[resultIdx] = nums[i];
                    resultIdx++;
                }
                newPair = false;
            } else {
                newPair = true;
                nums[resultIdx] = nums[i];
                resultIdx++;
            }
        }
        return resultIdx;
    }
}