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
        Integer sum = Arrays.stream(nums)
            .boxed()
            .parallel()
            .reduce(0, Integer::sum);
        Integer fullSum = nums.length * (nums.length + 1)/2;
        return fullSum - sum;
    }
}