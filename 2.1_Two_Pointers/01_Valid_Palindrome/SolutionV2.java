class Solution {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";

        assert isPalindrome(s);

        s = "tab a cat";
        assert !isPalindrome(s);

        s = " ";
        assert isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            while (i < j && !isAlphaNumeric(s.charAt(i)))
                i++;
            while (i < j && !isAlphaNumeric(s.charAt(j)))
                j--;

            char low = s.charAt(i);
            char high = s.charAt(j);
            if (isUpperCase(low))
                low += 'a' - 'A';

            if (isUpperCase(high))
                high += 'a' - 'A';

            if (low != high) {
                return false;
            }
        }

        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        return (c >= '0' && c <= '9') || isUpperCase(c) || (c >= 'a' && c <= 'z');
    }

    private static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

}
