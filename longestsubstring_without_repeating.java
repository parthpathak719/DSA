import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];
        Arrays.fill(hash, 0);
        int i = 0, j = 0, maxlen = 0, count = 0;
        while (j < n) {
            if (hash[s.charAt(j)] == 0) {
                count++;
            }
            hash[s.charAt(j)]++;
            if (count < j - i + 1) {
                while (count < j - i + 1) {
                    hash[s.charAt(i)]--;
                    if (hash[s.charAt(i)] == 0) {
                        count--;
                    }
                    i++;
                }
                j++;
            } else {
                maxlen = Math.max(maxlen, j - i + 1);
                j++;
            }
        }
        return maxlen;
    }
}