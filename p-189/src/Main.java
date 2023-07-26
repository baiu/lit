import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }
        //reverse first part
        reverse(nums, 0, nums.length - k - 1);
        //reverse second part
        reverse(nums, nums.length - k, nums.length - 1);
        //reverse all
        reverse(nums, 0, nums.length - 1);
    }
    public static void reverse(int nums[], int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}