import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SolutionV2 {
    public static void main(String[] args) {
        int[] nums;
        int target;
        int[] expected;

        nums = new int[] { 3, 4, 5, 6 };
        target = 7;
        expected = new int[] { 0, 1 };

        assert Arrays.toString(twoSum(nums, target)).equals(Arrays.toString(expected));

        nums = new int[] { 4, 5, 6 };
        target = 10;
        expected = new int[] { 0, 2 };

        assert Arrays.toString(twoSum(nums, target)).equals(Arrays.toString(expected))
                : Arrays.toString(twoSum(nums, target));

        nums = new int[] { 5, 5 };
        target = 10;
        expected = new int[] { 0, 1 };

        assert Arrays.toString(twoSum(nums, target)).equals(Arrays.toString(expected));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (m.containsKey(t)) {
                return new int[] { m.get(t), i };
            }
            m.put(nums[i], i);
        }
        return new int[0];
    }

}
