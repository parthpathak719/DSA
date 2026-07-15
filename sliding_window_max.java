import java.util.ArrayDeque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[n - k + 1];
        int i = 0, j = 0;
        while (j < n) {
            while (deque.size() > 0 && deque.peekLast() < nums[j]) {
                deque.pollLast();
            }
            deque.offerLast(nums[j]);
            if (j - i + 1 < k) {
                j++;
            } else {
                ans[i] = deque.peekFirst();
                if (nums[i] == deque.peekFirst()) {
                    deque.pollFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}