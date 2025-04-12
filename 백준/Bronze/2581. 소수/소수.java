import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }

            Arrays.sort(arr);

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            System.out.println(sum);
            System.out.println(arr[0]);
        }

    }
}