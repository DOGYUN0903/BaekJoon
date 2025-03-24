import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] divisors = new int[count];
        
        for(int i = 0; i<count; i++){
            divisors[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(divisors);
        
        int N = divisors[0] * divisors[count-1];
        System.out.println(N);
    }
}