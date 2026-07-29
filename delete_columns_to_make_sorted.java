class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int count = 0;
        for (int j = 0; j < m; j++) {
            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                    sorted = false;
                    break;
                }
            }
            if (!sorted) {
                count++;
            }
        }
        return count;
    }
}