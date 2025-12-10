import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, 4 }).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int var : nums) {
            System.out.println(var);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int l = i + 1;
            int h = nums.length - 1;

            while (l < h) {
                int sum = nums[i] + nums[l] + nums[h];
                if (sum < 0) {
                    // Se a soma é menor que 0, eu quero subir o pointer da esquerda
                    l++;
                } else if (sum > 0) {
                    // Se a soma é maior que 0, eu quero descer o pointer da direita
                    h--;
                } else {
                    // Se a soma é igual a zero, eu quero subir o pointer da direita e o da
                    // esquerda, porque não vai haver outro número, pelo menos único, que me consiga
                    // dar o resultado pretendido com qualquer um dos dois
                    res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                    while (l < h && nums[l] == nums[l - 1])
                        l++;
                }
            }

        }
        return res;

    }

}
