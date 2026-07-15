import java.util.Scanner;

public class practice {
    public static int sum(int[] a, int size) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        practice p = new practice();
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array items:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int ans = sum(arr, size);
        System.out.println("Sum of array is:" + ans);
    }

}