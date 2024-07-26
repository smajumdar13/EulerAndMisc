import java.util.Stack;

public class PalindromeString {
    public static String isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return "not ";
//                break;
            } else {
                i++;
                j--;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Testing:");
        String str0 = "abcdcba";
        String str1 = "SaUravMajUmdaR";
        String str2 = "SamRAgY!YgARmaS";
        String str3 = "SamRAgY!YgARmaS ";
        int n = 4;

        System.out.printf("String \"" + str0 + "\" is %sa palindrome\n", isPalindrome(str0));
        System.out.printf("String \"" + str1 + "\" is %sa palindrome\n", isPalindrome(str1));
        System.out.printf("String \"" + str2 + "\" is %sa palindrome\n", isPalindrome(str2));
        System.out.printf("String \"" + str3 + "\" is %sa palindrome\n", isPalindrome(str3));
        System.out.println(stackPalindrome(str0));
        System.out.println(stackPalindrome(str1));
        System.out.println(stackPalindrome(str2));
        System.out.println(stackPalindrome(str3));
    }

    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length()/2; i++) {
            stack.push(str.charAt(i));
        }
        for (int i = str.length()/2 + 1; i < str.length(); i++) {
            if (stack.peek() == str.charAt(i)) {
                stack.pop();
            }
        }

        if (stack.isEmpty() || stack.size() == 1) {
            return true;
        }
        return false;
    }
}

