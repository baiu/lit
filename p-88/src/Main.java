import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = nums2.length - 1;
        int resultIdx = nums1.length - 1;

        while (idx2 >= 0) {
            if (idx1 >= 0 && nums1[idx1] > nums2[idx2]) {
                nums1[resultIdx--] = nums1[idx1--];
            } else {
                nums1[resultIdx--] = nums2[idx2--];
            }
        }
    }
}