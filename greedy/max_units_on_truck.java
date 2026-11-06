import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int n = boxTypes.length, maxunits = 0;
        for (int i = 0; i < n; i++) {
            if (boxTypes[i][0] <= truckSize) {
                maxunits = maxunits + (boxTypes[i][0] * boxTypes[i][1]);
                truckSize = truckSize - boxTypes[i][0];
            } else {
                maxunits = maxunits + (truckSize * boxTypes[i][1]);
                break;
            }
        }
        return maxunits;
    }
}