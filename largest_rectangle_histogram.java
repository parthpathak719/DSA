import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<int[]> stack = new Stack<>();
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (!stack.isEmpty() && stack.peek()[0] < heights[i]) {
                list.add(stack.peek()[1]);
            } else if (!stack.isEmpty() && stack.peek()[0] >= heights[i]) {
                while (!stack.isEmpty() && stack.peek()[0] >= heights[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek()[1]);
                }
            }
            stack.push(new int[] { heights[i], i });
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        Stack<int[]> stack2 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack2.isEmpty()) {
                list2.add(n);
            } else if (!stack2.isEmpty() && stack2.peek()[0] < heights[i]) {
                list2.add(stack2.peek()[1]);
            } else if (!stack2.isEmpty() && stack2.peek()[0] >= heights[i]) {
                while (!stack2.isEmpty() && stack2.peek()[0] >= heights[i]) {
                    stack2.pop();
                }
                if (stack2.isEmpty()) {
                    list2.add(n);
                } else {
                    list2.add(stack2.peek()[1]);
                }
            }
            stack2.push(new int[] { heights[i], i });
        }

        Collections.reverse(list2);
        int[] width = new int[n];
        for (int i = 0; i < n; i++) {
            width[i] = list2.get(i) - list.get(i) - 1;
        }
        int[] area = new int[n];
        for (int i = 0; i < n; i++) {
            area[i] = width[i] * heights[i];
        }
        int max = area[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, area[i]);
        }
        return max;
    }
}