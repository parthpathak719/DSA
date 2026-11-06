

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] hash = new int[123];
        Arrays.fill(hash, 0);
        for (int i = 0; i < sentence.length(); i++) {
            hash[sentence.charAt(i)]++;
        }
        for (int i = 97; i <= 122; i++) {
            if (hash[i] == 0) {
                return false;
            }
        }
        return true;
    }
}