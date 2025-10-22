import java.util.HashMap;
import java.util.Map;

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
        var m = buildMap(s);
        var n = buildMap(t);
        if (m.size() != n.size()) {
            return false;
        }

        for (Character c : m.keySet()) {
            if (!m.get(c).equals(n.get(c))) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> buildMap(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        return m;
    }

}
