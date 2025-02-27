import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();  // 테스트케이스 개수 입력받기
        
        for (int t = 1; t <= T; t++) {
            int sum = 0;
            
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                if (num % 2 == 1) { // 홀수인지 판별
                    sum += num;
                }
            }
            
            System.out.println("#" + t + " " + sum);
        }
        
        scanner.close();
    }
}
