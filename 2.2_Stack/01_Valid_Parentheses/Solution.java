import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";

        assert isPalindrome(s);

        s = "tab a cat";
        assert !isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '(') {
                stack.add(c)
            }

        }
    }

}
