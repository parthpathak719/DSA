import java.util.Stack;
import java.util.ArrayList;

public class stock_span_another {
    public static ArrayList<Integer> find(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<int[]> stack = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (!stack.isEmpty() && stack.peek()[0] > arr[i]) {
                list.add(stack.peek()[1]);
            } else if (!stack.isEmpty() && stack.peek()[0] <= arr[i]) {
                while (!stack.isEmpty() && stack.peek()[0] <= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek()[1]);
                }
            }
            stack.push(new int[] { arr[i], i });
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, i - list.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        ArrayList<Integer> list = find(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}