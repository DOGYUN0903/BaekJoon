import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 출력 모아서 한 번에 하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 명령어 개수
        int N = Integer.parseInt(br.readLine());

        // 스택 선언
        Stack<Integer> stack = new Stack<>();

        // 명령어 N개만큼 반복
        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                // push 명령어 처리: 공백 기준으로 자름
                String[] parts = command.split(" ");
                int num = Integer.parseInt(parts[1]);
                stack.push(num); // 스택에 넣기

            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }

            } else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");

            } else if (command.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");

            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        // 출력
        System.out.print(sb);
    }
}