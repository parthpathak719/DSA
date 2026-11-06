import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int[] hash = new int[256];
        Arrays.fill(hash, 0);
        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                count++;
            }
        }
        int i = 0, j = 0;
        while (j < s2.length()) {
            if (hash[s2.charAt(j)] == 1) {
                count--;
            }
            hash[s2.charAt(j)]--;
            if (j - i + 1 < k) {
                j++;
            } else {
                if (count == 0) {
                    return true;
                }
                hash[s2.charAt(i)]++;
                if (hash[s2.charAt(i)] == 1) {
                    count++;
                }
                i++;
                j++;
            }
        }
        return false;
    }
}