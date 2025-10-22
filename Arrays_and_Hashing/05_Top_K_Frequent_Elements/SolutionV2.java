import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 1, -1, 2, -1, 2, 3 };
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        @SuppressWarnings("unchecked")
        List<Integer>[] freq = new List[nums.length + 1];
        int[] res = new int[k];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }

        for (var e : m.entrySet()) {
            freq[e.getValue()].add(e.getKey());
        }

        int j = 0;
        for (int i = freq.length - 1; k > 0; i--) {
            for (int n : freq[i]) {
                res[j] = n;
                j++;
                k--;
            }
        }

        return res;
    }
}
