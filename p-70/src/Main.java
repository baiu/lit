public class Main {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int all_ways_one_step_before = 2;
        int all_ways_two_steps_before = 1;
        int all_ways_sum = 0;

        for (int i = 3; i <= n; i++) {

            all_ways_sum = all_ways_one_step_before + all_ways_two_steps_before;
            // cos there will be 1 more step for all solutions
            all_ways_two_steps_before = all_ways_one_step_before; // +2 for all one_step_before
            all_ways_one_step_before = all_ways_sum; // +1 to all previous solutions
        }
        return all_ways_sum;
    }
}