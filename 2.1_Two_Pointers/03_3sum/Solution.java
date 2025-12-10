import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> current = Arrays.asList(nums[i], nums[j], nums[k]);
                        current.sort(null);
                        if (!isDuplicate(res, current)) {
                            res.add(current);
                        }
                    }
                }
            }
        }
        return res;
    }

    private boolean isDuplicate(List<List<Integer>> list, List<Integer> current) {
        for (List<Integer> l : list) {
            if (l.get(0) == current.get(0) &&
                    l.get(1) == current.get(1) &&
                    l.get(2) == current.get(2))
                return true;
        }
        return false;
    }
}
