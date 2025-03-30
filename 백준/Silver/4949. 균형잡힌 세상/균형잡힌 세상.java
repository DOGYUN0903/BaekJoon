import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            // 종료 조건: 점 하나만 있는 줄
            if (line.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char ch : line.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        balanced = false;
                        break;
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        balanced = false;
                        break;
                    }
                }
            }

            // 남아있는 괄호가 있으면 균형이 아님
            if (!stack.isEmpty()) balanced = false;

            System.out.println(balanced ? "yes" : "no");
        }
    }
}
