import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int [] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }


    /**
     * 1480. Running Sum of 1d Array
     * https://leetcode.com/problems/running-sum-of-1d-array/
     */
    public static int[] runningSum(int[] nums) {
        AtomicInteger subtotal = new AtomicInteger();
        return Arrays.stream(nums)
            .map(num -> {
                subtotal.set(subtotal.get() + num);
                num = subtotal.get();
                return num;
            })
            .toArray();
    }
}