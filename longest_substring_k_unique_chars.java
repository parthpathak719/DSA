import java.util.Arrays;

public class longest_substring_k_unique_chars {
    public static int longest(String s, int k) {
        int n = s.length();
        int[] hash = new int[256];
        int i = 0, j = 0, maxlen = 0, count = 0;
        while (j < n) {
            if (hash[s.charAt(j)] == 0) {
                count++;
            }
            hash[s.charAt(j)]++;
            if (count < k) {
                j++;
            } else if (count == k) {
                maxlen = Math.max(maxlen, j - i + 1);
                j++;
            } else {
                while (count > k) {
                    hash[s.charAt(i)]--;
                    if (hash[s.charAt(i)] == 0) {
                        count--;
                    }
                    i++;
                }
                j++;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "absaabcedab";
        int k = 3;
        int ans = longest(s, k);
        System.out.println("answer is:" + ans);
    }
}
