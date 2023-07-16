public class Main {

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.startsWith(needle)) {
            return 0;
        }

        String[] split = haystack.split(needle);
        if (split.length > 1) {
            return split[0].length();
        }

        if (haystack.endsWith(needle)) {
            return haystack.length() - needle.length();
        }

        return -1;
    }
}