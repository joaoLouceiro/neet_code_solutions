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
        for (int i = 0; i < strs.length; i++) {
            List<String> a = Arrays.asList(strs[i].split(""));
            a.sort(null);
            String sortedString = String.join("", a);
            List<String> val = m.getOrDefault(sortedString, new ArrayList<>());
            val.add(strs[i]);
            m.put(sortedString, val);
        }
        return new ArrayList<>(m.values());
    }

}
