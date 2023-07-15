public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueElementsAmount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[uniqueElementsAmount] = nums[i];
                uniqueElementsAmount++;
            }
        }
        return uniqueElementsAmount;
    }
}