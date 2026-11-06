import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ana = true;
        if (s.length() != t.length()) {
            ana = false;
        }
        int[] hash1 = new int[256];
        int[] hash2 = new int[256];
        Arrays.fill(hash1, 0);
        Arrays.fill(hash2, 0);
        for (int i = 0; i < s.length(); i++) {
            hash1[s.charAt(i)] = hash1[s.charAt(i)] + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            hash2[t.charAt(i)] = hash2[t.charAt(i)] + 1;
        }
        for (int i = 0; i < hash1.length; i++) {
            if (hash1[i] != hash2[i]) {
                ana = false;
            }
        }
        return ana;
    }
}