import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // nums[i] == nums[j] and abs(i - j) <= k
        Map<Integer, Integer> map = new HashMap<>();
        for (int currIdx = 0; currIdx < nums.length; currIdx++) {
            int currValue = nums[currIdx];

            if (map.containsKey(currValue) && Math.abs(map.get(currValue) - currIdx) <= k) {
                return true;
            }
            map.put(currValue, currIdx);
        }
        return false;
    }
}