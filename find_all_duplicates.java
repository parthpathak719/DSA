import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            int index = val - 1;
            if (nums[index] < 0) {
                list.add(val);
            } else {
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}