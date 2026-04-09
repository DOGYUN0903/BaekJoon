import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        if (min == max || max - min == 1) {
            System.out.println(0);
            return;
        }
        
        System.out.println(max - min - 1);
        
        StringBuilder sb = new StringBuilder();
        for (long i = min + 1; i < max; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
