public class longest_substring_DP {
    public static int longest(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        int maxlen = 0;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxlen = Math.max(dp[i][j], maxlen);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String text1 = "hello";
        String text2 = "ello";
        int ans = longest(text1, text2);
        System.out.println("longest substring is:" + ans);
    }
}
