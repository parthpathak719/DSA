class Solution {
    public int jump(int[] nums) {
        int jumps = 0, l = 0, r = 0;
        int n = nums.length;
        while (r < n - 1) {
            int maxreach = 0;
            for (int i = l; i <= r; i++) {
                maxreach = Math.max(maxreach, nums[i] + i);
            }
            l = r + 1;
            r = maxreach;
            jumps++;
        }
        return jumps;
    }
}