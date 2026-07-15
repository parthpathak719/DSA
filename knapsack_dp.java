public class knapsack_dp {
    public static int knapsack(int[] weight, int[] val, int W, int n) {
        int[][] dp = new int[n + 1][W + 1];
        // this block is not necessary
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (weight[i - 1] <= j) {
                    int choice1 = val[i - 1] + dp[i - 1][j - weight[i - 1]];
                    int choice2 = dp[i - 1][j];
                    dp[i][j] = Math.max(choice1, choice2);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] weight = { 1, 2, 3, 4, 5 };
        int[] val = { 6, 7, 8, 9, 10 };
        int W = 10;
        int n = weight.length;
        int ans = knapsack(weight, val, W, n);
        System.out.println("answer is:" + ans);

    }
}