import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int [] nums = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }


    /**
     * 724. Find Pivot Index
     * https://leetcode.com/problems/find-pivot-index
     */
    public static int pivotIndex(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
            .boxed()
            .toList();

        int allSum = list.parallelStream()
            .reduce(0, Integer::sum);

        if (allSum - list.get(0) == 0) {
            return 0;
        }

        Integer leftSum = 0;
        Integer rightSum = allSum - list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer prevPoint = list.get(i - 1);
            Integer currPoint = list.get(i);
            leftSum = leftSum + prevPoint;

            rightSum = rightSum - currPoint;

            if (leftSum.equals(rightSum)) {
                return i;
            }
        }

        if (allSum - list.get(list.size() - 1) == 0) {
            return 0;
        }

        return -1;
    }
}