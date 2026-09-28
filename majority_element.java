import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = nums[0];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                count = 1;
                map.put(nums[i], count);
            }
            if (map.get(nums[i]) > n / 2) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}