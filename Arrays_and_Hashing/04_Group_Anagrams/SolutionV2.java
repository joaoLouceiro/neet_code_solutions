import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        String[] strs;

        strs = new String[] { "act", "pots", "tops", "cat", "stop", "hat" };

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return Arrays.asList(Arrays.asList());
        if (strs.length == 1)
            return Arrays.asList(Arrays.asList(strs));

        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            int[] key = new int[26];
            for (char c : s.toCharArray()) {
                key[(int) c - (int) 'a'] += 1;
            }
            String sKey = Arrays.toString(key);
            m.putIfAbsent(sKey, new ArrayList<>());
            m.get(sKey).add(s);
        }

        return new ArrayList<>(m.values());
    }

}
