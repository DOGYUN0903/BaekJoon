import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(number(arr) % 10);

    }

    static int number(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i] * num[i];
        }
        return sum;
    }
}