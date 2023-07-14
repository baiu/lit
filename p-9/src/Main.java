public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1223));
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        while (x > 0) {
            reversed = x % 10 + reversed * 10;
            x = x / 10;
        }
        return reversed == original;
    }
}