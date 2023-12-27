import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[7]; // 주사위 눈의 수 카운트 배열

        // 주사위 눈의 수 입력받기
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            counts[num]++;
        }

        int result = 0;

        // 세 개의 주사위 눈이 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                result = 10000 + i * 1000;
                break;
            }
        }

        // 두 개의 주사위 눈이 같은 경우
        if (result == 0) {
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    result = 1000 + i * 100;
                    break;
                }
            }
        }

        // 모두 다른 눈의 수인 경우
        if (result == 0) {
            for (int i = 6; i >= 1; i--) {
                if (counts[i] == 1) {
                    result = i * 100;
                    break;
                }
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
