public class fibonacci {
    public static int sequence(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return sequence(n - 1) + sequence(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = sequence(n);
        System.out.println(n + " number of fibonacci is:" + ans);
    }
}
