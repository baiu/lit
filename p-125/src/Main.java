import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s.isBlank()) {
            return true;
        }
        int headIdx = 0, tailIdx = s.length() - 1;
        char head, tail;
        while(headIdx <= tailIdx) {
            head = s.charAt(headIdx);
            tail = s.charAt(tailIdx);
            if (!isLetterOrDigit(head)) {
                headIdx++;
            } else if(!isLetterOrDigit(tail)) {
                tailIdx--;
            } else {
                if (toLowerCase(head) != toLowerCase(tail)) {
                    return false;
                }
                headIdx++;
                tailIdx--;
            }
        }

        return true;
    }
}