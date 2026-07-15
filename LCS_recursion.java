public class LCS_recursion {
    public static int longest(String text1, String text2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
            return 1 + longest(text1, text2, n - 1, m - 1);
        } else {
            int choice1 = longest(text1, text2, n - 1, m);
            int choice2 = longest(text1, text2, n, m - 1);
            return Math.max(choice1, choice2);
        }
    }

    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "def";
        int n = text1.length();
        int m = text2.length();
        int ans = longest(text1, text2, n, m);
        System.out.println("LCS is:" + ans);
    }
}
