import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        int[] arr = new int[2];
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                arr[0] = map.get(diff);
                arr[1] = i;
            }
            map.put(nums[i], i);
        }
        if (arr[0] == 0 && arr[1] == 0) {
            return null;
        }
        return arr;
    }
}