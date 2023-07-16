import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for (int n : nums) {
            Integer nCount = numsCount.getOrDefault(n, 0);
            numsCount.put(n, ++nCount);
            if (nCount > nums.length / 2) {
                return n;
            }
        }
        return 0;
    }
}