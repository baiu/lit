public class Main {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
//        F(0) = 0, F(1) = 1
//        F(n) = F(n - 1) + F(n - 2), for n > 1.

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int f1 = 0;
        int f2 = 1;
        int fn = 0;

        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}