public class Main {

    public static void main(String[] args) {
        // Write a Java Program to swap two numbers without using the third variable.
        int a = 128, b = 256;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}