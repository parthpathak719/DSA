public class maxSubarray_size_k {
    public static int maxsubarr(int[] arr, int k) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else {
                maxsum = Math.max(maxsum, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        int ans = maxsubarr(arr, k);
        System.out.println("maxsum is:" + ans);
    }
}