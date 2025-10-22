class Solution {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int h = numbers.length - 1;
        while (true) {
            int sum = numbers[l] + numbers[h];
            if (sum == target)
                return new int[] { l + 1, h + 1 };
            else if (sum > target) {
                h--;
            } else {
                l++;
            }
        }
    }
}
