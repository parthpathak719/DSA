import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        Arrays.sort(nums);
        while (i < n && nums[i] < 0 && k > 0) {
            nums[i] = -nums[i];
            k--;
            i++;
        }
        if (k % 2 == 1) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + nums[j];
        }
        return sum;
    }
}