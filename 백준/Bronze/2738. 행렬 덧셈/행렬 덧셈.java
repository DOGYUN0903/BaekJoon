import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 행렬의 크기 N과 M 입력받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 2. 행렬 A와 B 선언
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 3. 행렬 A 입력받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 4. 행렬 B 입력받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 5. 행렬 A와 B를 더한 결과 출력하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = A[i][j] + B[i][j];
                System.out.print(sum + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }

        sc.close();
    }
}