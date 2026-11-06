class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String t = s.trim();
        int n = t.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = t.charAt(i);
            if (c == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}