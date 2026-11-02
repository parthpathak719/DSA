class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0, n = command.length();
        while (i < n) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append("G");
                i++;
            } else if (c == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i = i + 2;
                } else {
                    sb.append("al");
                    i = i + 4;
                }
            }
        }
        return sb.toString();
    }
}