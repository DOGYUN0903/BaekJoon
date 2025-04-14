import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A + B) - C);

        String A1 = String.valueOf(A);
        String B1 = String.valueOf(B);
        String C1 = String.valueOf(C);

        int sum = Integer.parseInt((A1 + B1));

        System.out.println(sum-C);
    }
}