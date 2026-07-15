import java.util.Arrays;

public class shortest_job_first {
    public static int job(int[] arr) {
        int n = arr.length;
        int count = 0;
        int total = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            count = count + arr[i];
            total = total + count;
        }
        total = total / n;
        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 1, 2 };
        int ans = job(arr);
        System.out.println("average waiting time is: " + ans);
    }
}
