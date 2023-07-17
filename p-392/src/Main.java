public class Main {

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) {
            return true;
        }

        int sIdx = 0;
        char[] sChars = s.toCharArray();
        int sLength = s.length();
        for (char tChar : t.toCharArray()) {
            if (sIdx >= sLength) {
                break;
            }
            if (tChar == sChars[sIdx]) {
                sIdx++;
            }
        }
        return sIdx == sLength;
    }
}