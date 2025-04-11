import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A*B*C;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        String num = String.valueOf(sum);
        char[] ch = num.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int digit = ch[i] - '0'; 
            arr[digit]++;             
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}