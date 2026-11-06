public class recursion_knapsack {
    public static int knapsack(int[] weight, int[] val, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (weight[n - 1] <= W) {
            int choice1 = val[n - 1] + knapsack(weight, val, W - weight[n - 1], n - 1);
            int choice2 = knapsack(weight, val, W, n - 1);
            return Math.max(choice1, choice2);
        }
        return knapsack(weight, val, W, n - 1);
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