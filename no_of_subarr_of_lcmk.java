class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            long currentlcm = nums[i];
            if (nums[i] == k) count++;
            if (currentlcm > k) continue;
            for (int j = i + 1; j < nums.length; j++) {
                currentlcm = lcm(currentlcm, nums[j]);
                if (currentlcm == k) count++;
                if (currentlcm > k) break;
            }
        }
        return count;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}