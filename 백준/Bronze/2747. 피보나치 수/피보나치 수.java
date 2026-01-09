import java.util.Scanner;

public class Main{
    
    private static int[] memo;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        memo = new int[n+1];
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo[n] != 0) {
            return memo[n];
        }
        
        memo[n] = fibo(n - 1) + fibo(n - 2);
        return memo[n];
    }
}