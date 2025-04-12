import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                list.add(num);
            }
        }

        System.out.println(list.size());
    }
}