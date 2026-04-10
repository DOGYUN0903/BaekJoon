import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int sum = A * B * C;
        
        String numStr = String.valueOf(sum);
        
        char[] numArr = numStr.toCharArray();
        
        int[] count = new int[10];
        
        for (char c : numArr) {
            int index = c - '0';
            count[index]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}