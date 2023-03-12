import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }


    /**
     * 205. Isomorphic Strings
     * https://leetcode.com/problems/isomorphic-strings
     */
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(charMap.containsKey(a)) {
                if (!charMap.get(a).equals(b)) {
                    return false;
                }
            } else {
                if (!charMap.containsValue(b)) {
                    charMap.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}