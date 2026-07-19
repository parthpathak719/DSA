import java.util.Arrays;

public class min_platforms {
    public static int platforms(int[] arrival, int[] departure) {
        int n = arrival.length;
        int m = departure.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int count = 0, maxcount = 0;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arrival[i] <= departure[j]) {
                count = count + 1;
                i++;
            } else {
                count = count - 1;
                j++;
            }
            maxcount = Math.max(count, maxcount);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int[] arrival = { 900, 945, 955, 1100, 1500, 1800 };
        int[] departure = { 920, 1130, 1150, 1200, 1900, 2000 };
        int ans = platforms(arrival, departure);
        System.out.println("min platforms are: " + ans);
    }
}