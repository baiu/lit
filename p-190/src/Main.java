public class Main {

    public static void main(String[] args) {
        int n = 421;
        print(n);
        n = reverseBits(n);
        print(n);
    }

    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            // shifts a bit pattern to the left, set last bit to 0
            res = res << 1;
            // set to 1 or stay 0 the last bit of res depending on the last bit of n
            res = res | (n & 1); // copy last bit
            n = n >> 1;
        }
        return res;
    }

    private static void print(int n) {
        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
    }
}