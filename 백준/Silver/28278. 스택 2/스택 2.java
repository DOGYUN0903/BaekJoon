import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 결과를 모아두는 StringBuilder
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령 개수
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            if (command[0].equals("1")) {
                int x = Integer.parseInt(command[1]);
                stack.push(x);
            } else if (command[0].equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
            } else if (command[0].equals("3")) {
                sb.append(stack.size()).append('\n');
            } else if (command[0].equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            } else if (command[0].equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            }
        }

        // 한 번에 출력
        System.out.print(sb);
    }
}