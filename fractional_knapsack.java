import java.util.Arrays;

public class fractional_knapsack {
    public static double knapsack(int[][] items, int capacity) {
        Arrays.sort(items, (a, b) -> {
            double ratio1 = (double) a[0] / a[1];
            double ratio2 = (double) b[0] / b[1];
            return Double.compare(ratio2, ratio1);
        });
        double profit = 0;
        int n = items.length;
        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][1]) {
                profit = profit + items[i][0];
                capacity = capacity - items[i][1];
            } else {
                double ratio = (double) items[i][0] / items[i][1];
                profit = profit + (ratio * capacity);
                break;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[][] items = { { 100, 20 }, { 60, 10 }, { 100, 50 }, { 200, 50 } };
        int capacity = 90;
        double ans = knapsack(items, capacity);
        System.out.println("total profit is:" + ans);
    }
}
