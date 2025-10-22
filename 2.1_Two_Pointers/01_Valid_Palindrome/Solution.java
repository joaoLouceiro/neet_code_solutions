class Solution {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";

        assert isPalindrome(s);

        s = "tab a cat";
        assert !isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        char[] arr = s.replaceAll("\\W", "").toLowerCase().toCharArray();
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j])
                return false;
        }

        return true;
    }

}
