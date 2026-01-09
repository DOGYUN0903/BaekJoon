import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int answer = 0;
        
        for (int i = 1; i < N; i++) {
            if (divideSum(i) == N) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
    
    private static int divideSum(int n) {
        int sum = n;
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
}