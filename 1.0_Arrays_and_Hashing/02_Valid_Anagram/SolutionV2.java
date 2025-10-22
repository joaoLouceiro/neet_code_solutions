import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String s, t;
        s = "racecar";
        t = "carrace";
        assert isAnagram(s, t);

        s = "jar";
        t = "jam";
        assert isAnagram(s, t) == false;

    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        var a = Arrays.asList(s.split(""));
        var b = Arrays.asList(t.split(""));

        a.sort(null);
        b.sort(null);

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) return false;
        }

        return true;

    }


}
