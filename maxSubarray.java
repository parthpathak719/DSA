class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum > maxsum) {
                maxsum = sum;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }
}