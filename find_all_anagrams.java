import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        int[] hash = new int[256];
        for (int i = 0; i < p.length(); i++) {
            hash[p.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                count++;
            }
        }
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (j < s.length()) {
            if (hash[s.charAt(j)] == 1) {
                count--;
            }
            hash[s.charAt(j)]--;
            if (j - i + 1 < k) {
                j++;
            } else {
                if (count == 0) {
                    list.add(i);
                }
                hash[s.charAt(i)]++;
                if (hash[s.charAt(i)] == 1) {
                    count++;
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
