import java.util.Arrays;

class Solution {
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

        assert Arrays.toString(twoSum(nums, target)).equals(Arrays.toString(expected));

        nums = new int[] { 5, 5 };
        target = 10;
        expected = new int[] { 0, 1 };

        assert Arrays.toString(twoSum(nums, target)).equals(Arrays.toString(expected));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int t = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == t) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

}
