import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        binary(n);
    }
    
    static void binary(long n) {
        if (n == 0) return;
        binary(n / 2);
        System.out.print(n % 2);
    }
}