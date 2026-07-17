import java.util.Arrays;

public class n_meeting_1room {
    public static int meetings(int[] start, int[] end) {
        int n = start.length;
        if (n == 0) {
            return 0;
        }
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int number = 1;
        int freetime = arr[0][1];
        for (int i = 1; i < n; i++) {
            if (arr[i][0] >= freetime) {
                number++;
                freetime = arr[i][1];
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        int ans = meetings(start, end);
        System.out.println("max meetings are: " + ans);
    }
}
