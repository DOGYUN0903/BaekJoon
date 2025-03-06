import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt();  
        
        int[] arr = new int[N];
        int[] s = new int[N];  
        
     
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                s[i] = arr[i];
            } else {
                s[i] = s[i - 1] + arr[i];
            }
        }

    
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int sum;

            if (i == 1) { 
                sum = s[j - 1];
            } else {
                sum = s[j - 1] - s[i - 2];
            }

            System.out.println(sum);
        }
        
        sc.close();
    }
}