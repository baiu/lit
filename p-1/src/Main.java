import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int currIdx = 0; currIdx < nums.length; currIdx++) {
            int currValue = nums[currIdx];
            int requiredNum = target - currValue;

            if (map.containsKey(requiredNum)) {
                Integer requiredIdx = map.get(requiredNum);
                return new int[]{requiredIdx, currIdx};
            }
            map.put(currValue, currIdx);
        }
        return new int[]{};
    }
}