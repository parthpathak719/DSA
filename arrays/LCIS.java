class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int count = 1, maxcount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
                maxcount = Math.max(count, maxcount);
            } else {
                count = 1;
            }
        }
        return maxcount;
    }
}