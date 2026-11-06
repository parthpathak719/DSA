import java.util.Arrays;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, 0);
        for (int i = 0; i < jewels.length(); i++) {
            hash[jewels.charAt(i)]++;
        }
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (hash[c] > 0) {
                count++;
            }
        }
        return count;
    }
}