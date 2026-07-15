import java.util.Scanner;

public class palindrome {
    public static boolean pal(String check) {
        boolean ispal = true;
        for (int i = 0; i < check.length() / 2; i++) {
            if (check.charAt(i) != check.charAt(check.length() - 1 - i)) {
                ispal = false;
                break;
            }
        }
        return ispal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = s.nextLine();
        boolean ans = pal(str);
        if (ans) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}
