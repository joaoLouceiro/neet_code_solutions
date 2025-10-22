import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 1, -1, 2, -1, 2, 3 };
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> m = new HashMap<>();

        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        var sortedMap = m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        var list = new ArrayList<>(sortedMap.keySet());
        for (int i = 0; i < k; i++) {

            res[i] = list.get(i);

        }
        return res;
    }
}
