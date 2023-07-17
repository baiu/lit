import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        char[] patternChars = pattern.toCharArray();
        String[] strings = s.split(" ");

        if (strings.length != patternChars.length) return false;

        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> stringsMap = new HashMap<>();
        for (int i = 0; i < patternChars.length; i++) {
            if (!patternMap.containsKey(patternChars[i])) {
                patternMap.put(patternChars[i], strings[i]);
            } else if (!patternMap.get(patternChars[i]).equals(strings[i])) {
                return false;
            }

            if (!stringsMap.containsKey(strings[i])) {
                stringsMap.put(strings[i], patternChars[i]);
            } else if (!stringsMap.get(strings[i]).equals(patternChars[i])) {
                return false;
            }
        }
        return true;
    }
}