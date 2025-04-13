import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();

        System.out.println(addNum(A,B));
    }

    static long addNum(long num1, long num2) {
        return (num1+num2)*(num1-num2);
    }
}