import java.util.Stack;
public class stack_practice {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("top:"+stack.peek());
        System.out.println("popped element:"+stack.pop());
        System.out.println("new top:"+stack.peek());
    }
}
