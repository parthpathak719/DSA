import java.util.Scanner;
import java.util.Arrays;

public class LIS {
    public static int lis(int n, int[] arr) {

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxlen = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxlen = Math.max(maxlen, dp[i]);
        }

        return maxlen;
    }
}