import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        int[] arr = new int[list.size()];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = list.get(j);
        }

        if (arr.length >= K) {
            System.out.println(arr[K - 1]);
        } else {
            System.out.println(0);
        }


    }
}