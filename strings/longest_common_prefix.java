class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) {
            return "";
        }
        String s = strs[0];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 1; j < n; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}