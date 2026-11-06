import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int score = 0, maxscore = 0;
        Arrays.sort(tokens);
        int i = 0, j = n - 1;
        while (i <= j) {
            if (power >= tokens[i]) {
                power = power - tokens[i];
                score++;
                maxscore = Math.max(score, maxscore);
                i++;
            } else if (score > 0) {
                power = power + tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }
        return maxscore;
    }
}