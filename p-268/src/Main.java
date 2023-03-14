import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }


    /**
     * 268. Missing Number
     * https://leetcode.com/problems/missing-number/
     */
    public static int missingNumber(int[] nums) {
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result ^= nums[i] ^ i;
        }
        result ^= length;
        return result;
    }
}