public class longest_subarray_of_sumk {
    public static int longest(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0, sum = 0, maxsub = 0;
        while (j < n) {
            sum = sum + arr[j];
            if (sum < k) {
                j++;
            } else if (sum == k) {
                maxsub = Math.max(maxsub, j - i + 1);
                j++;
            } else {
                while (sum > k) {
                    sum = sum - arr[i];
                    i++;
                }
                if (sum == k) { // check after shrinking, before moving on
                    maxsub = Math.max(maxsub, j - i + 1);
                }
                j++;
            }
        }
        return maxsub;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 9;
        int ans = longest(arr, k);
        System.out.println("answer is:" + ans);
    }
}
