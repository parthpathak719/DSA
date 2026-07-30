import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        Arrays.sort(costs, (a, b) -> {
            int diff1 = a[0] - a[1];
            int diff2 = b[0] - b[1];
            return Integer.compare(diff1, diff2);
        });
        int cost = 0;
        for (int i = 0; i < n; i++) {
            cost = cost + costs[i][0];
        }
        for (int i = n; i < 2 * n; i++) {
            cost = cost + costs[i][1];
        }
        return cost;
    }
}