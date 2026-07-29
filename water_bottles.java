class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int remainder = numBottles % numExchange;
            int quote = numBottles / numExchange;
            ans = ans + quote;
            numBottles = remainder + quote;
        }
        return ans;
    }
}