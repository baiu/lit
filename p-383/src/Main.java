import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> countMap = new HashMap<>(26);

        for (Character ch : magazine.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : ransomNote.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) - 1);
        }

        return !countMap.values().stream().anyMatch(n -> n < 0);
    }
}