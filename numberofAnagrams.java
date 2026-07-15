import java.util.Arrays;

public class numberofAnagrams {
    public static int validana(String text, String pattern) {
        int k = pattern.length();
        int[] hash = new int[256];
        Arrays.fill(hash, 0);
        for (int i = 0; i < pattern.length(); i++) {
            hash[pattern.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                count++;
            }
        }
        int i = 0, j = 0, ans = 0;
        while (j < text.length()) {
            if (hash[text.charAt(j)] == 1) {
                count--;
            }
            hash[text.charAt(j)]--;
            if (j - i + 1 < k) {
                j++;
            } else {
                if (count == 0) {
                    ans++;
                }
                hash[text.charAt(i)]++;
                if (hash[text.charAt(i)] == 1) {
                    count++;
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pattern = "abc";
        int ans = validana(text, pattern);
        System.out.println("answer is:" + ans);
    }
}