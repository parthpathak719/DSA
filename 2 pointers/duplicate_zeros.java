class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j >= n)
                break;
            if (arr[i] == 0) {
                result[j] = 0;
                j++;
                if (j < n) {
                    result[j] = 0;
                    j++;
                }
            } else {
                result[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}