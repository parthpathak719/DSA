class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "");
        String q = t.toLowerCase();
        int n = q.length();
        for (int i = 0; i < n / 2; i++) {
            if (q.charAt(i) != q.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
