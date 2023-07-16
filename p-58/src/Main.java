public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        return trimmed.length() - 1 - trimmed.lastIndexOf(" ");
    }
}