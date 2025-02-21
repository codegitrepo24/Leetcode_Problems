import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static String LongestPalindromicSubstring(String s) {

        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int testCases = sc.nextInt();
        sc.nextLine(); // consume the newline character

        for (int t = 0; t < testCases; t++) {
            System.out.println("Enter the string for test case " + (t + 1) + ": ");
            String s = sc.nextLine();
            String result = LongestPalindromicSubstring(s);
            System.out.println("The longest palindromic substring is: " + result);
        }
        sc.close();
    }
}
