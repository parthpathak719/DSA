class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x = String.join("", word1);
        String y = String.join("", word2);
        System.out.print(x + " " + y);
        if (x.equals(y)) {
            return true;
        } else {
            return false;
        }
    }
}