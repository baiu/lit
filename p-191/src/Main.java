public class Main {

    public static void main(String[] args) {
        System.out.println(hammingWeight(521));
    }

    public static int hammingWeight(int n) {
        int ones = 0;
        log0(n);
        while (n != 0) {
                                                                                                                                            log1(n, ones);
            ones = ones + (n & 1);
                                                                                                                                           log2(ones);
            n = n >>> 1;
                                                                                                                                            log3(n);
        }

        return ones;
    }

    public static int hammingWeight2(int n) {
        int oneBitCount = 0;

        while (n != 0) {
                                                                                                                                        log4(n);
            n = n & (n - 1); // to clear the most right oneBit
                                                                                                                                      log("n = n & (n-1) \n  n = ", n);
            ++oneBitCount;
                                                                                                                                        System.out.println("oneBitCount = " + oneBitCount);
        }

        return oneBitCount;
    }





















    private static void log0(int n) {
        log("n = ", n);
        log("1 = ", 1);
        System.out.println("ones = 0");
    }

    private static void log1(int n, int ones) {
        System.out.println("ones = ones + (n & 1);");
        System.out.println("ones = " + ones + " + " + (n & 1) + ";");
    }

    private static void log2(int ones) {
        System.out.println("ones = " + ones + "\n");
    }

    private static void log3(int n) {
        System.out.println("n = n>>>1; \n" + "n = " + Integer.toBinaryString(n));
        System.out.println("1 = " + String.format("%" + Integer.toBinaryString(n).length() + "s", Integer.toBinaryString(1)).replace(' ', '0'));
    }

    private static void log4(int n) {
        log("n   = ", n);
        log("n-1 = ", n - 1);
    }

    private static void log(String prefix, int n) {
        System.out.println(prefix + String.format("%16s", Integer.toBinaryString(n)).replace(' ', '0'));
    }
}