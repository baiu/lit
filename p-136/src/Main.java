public class Main {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        // XOR operation with 0 gives the same number (2 XOR 0 = 2)
        int ans = 0;
        for (int num : nums) {
            // XOR operation with same number gives 0 (2 XOR 2 = 0)
            // order doesn't matter in performing XOR operation (2^3^4^5 = 3^2^5^4 = 4^2^5^3)
            ans = ans ^ num;
        }
        return ans;
    }
}
