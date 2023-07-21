import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{0})));
    }

    public static int[] plusOne(int[] digits) {

        int estVume = 0;
        if (digits[digits.length - 1] < 9) {
            ++digits[digits.length - 1];
            return digits;
        } else  {
            digits[digits.length - 1] = 0;
            estVume++;
        }

        for (int i = digits.length - 2; i >= 0; i--) {

            if (estVume > 0) {
                digits[i]++;
                estVume--;
            }

            if (digits[i] > 9) {
                digits[i] = 0;
                estVume++;
            }

        }

        if (estVume > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }

        return digits;
    }
}