import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(
                new ArrayList<Integer>(Arrays.asList(1, 2, 3)).equals(
                        new ArrayList<Integer>(Arrays.asList(3, 2, 1))));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> current = Arrays.asList(nums[i], nums[j], nums[k]);
                        current.sort(null);
                        if (!res.contains(current))
                            res.add(current);

                    }
                }
            }
        }
        return res;
    }

}
