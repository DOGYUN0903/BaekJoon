import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int current = 1;  // 스택에 넣을 숫자
        boolean isPossible = true;
        
        for (int i = 0; i < n; i++) {
            int target = sc.nextInt();
            
            // target이 나올 때까지 push
            while (current <= target) {
                stack.push(current++);
                sb.append("+\n"); // push 연산 기록
            }
            
            // 스택의 top이 target과 같으면 pop
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n"); // pop 연산 기록
            } else {
                isPossible = false; // 불가능한 경우
                break;
            }
        }
        
        // 정답 출력
        if (isPossible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
