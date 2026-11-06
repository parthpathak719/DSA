class Solution {
    public int balancedStringSplit(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                r++;
            } else {
                l++;
            }
            if (l == r) {
                count++;
            }
        }
        return count;
    }
}