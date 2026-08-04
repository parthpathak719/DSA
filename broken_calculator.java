class Solution {
    public int brokenCalc(int startValue, int target) {
        int ops = 0;
        int value = startValue;
        while (target > value) {
            if (target % 2 == 0) {
                target = target / 2;
            } else {
                target = target + 1;
            }
            ops++;
        }
        ops = ops + (value - target);
        return ops;
    }
}