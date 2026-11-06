import java.util.Arrays;

public class job_sequencing {
    public static int jobs(int[][] arr) {
        Arrays.sort(arr, (a, b) -> b[2] - a[2]);
        int maxdeadline = 0;
        for (int i = 0; i < arr.length; i++) {
            maxdeadline = Math.max(maxdeadline, arr[i][1]);
        }
        int[] hash = new int[maxdeadline + 1];
        Arrays.fill(hash, -1);
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i][1]; j > 0; j--) {
                if (hash[j] == -1) {
                    hash[j] = arr[i][0];
                    profit = profit + arr[i][2];
                    break;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 40 }, { 2, 1, 10 }, { 3, 1, 40 }, { 4, 1, 30 } };
        int ans = jobs(arr);
        System.out.println("max profit is:" + ans);
    }
}
