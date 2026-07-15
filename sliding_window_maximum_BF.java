import java.util.ArrayList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - k + 1; i++) {
            int maxnum = nums[i];
            for (int j = i; j < i + k; j++) {
                int num = nums[j];
                maxnum = Math.max(maxnum, num);
            }
            list.add(maxnum);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}   