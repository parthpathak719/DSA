import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        int arrows = 1;
        Arrays.sort(points, (a, b) -> {
            return Integer.compare(a[0], b[0]);
        });
        int track = points[0][1];
        for (int i = 1; i < n; i++) {
            if (points[i][0] > track) {
                arrows++;
                track = points[i][1];
            } else {
                track = Math.min(track, points[i][1]);
            }
        }
        return arrows;
    }
}