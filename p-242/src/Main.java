import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            map.put(sChars[i], map.getOrDefault(sChars[i], 0) + 1);
            map.put(tChars[i], map.getOrDefault(tChars[i], 0) - 1);
        }
        return map.values().stream().noneMatch(n -> n < 0);
    }
}