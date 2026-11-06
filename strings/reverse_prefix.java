class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        boolean check = false;
        while (i < n) {
            if (word.charAt(i) == ch) {
                if (count == 0) {
                    check = true;
                    int j = i;
                    while (j >= 0) {
                        sb.append(word.charAt(j));
                        j--;
                    }
                    count++;
                    i++;
                }
            }
            if (count == 1 && i < n) {
                sb.append(word.charAt(i));
                i++;
            } else {
                i++;
            }
        }
        if (!check) {
            return word;
        } else {
            return sb.toString();
        }
    }
}