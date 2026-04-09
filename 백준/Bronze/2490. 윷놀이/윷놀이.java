import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            int[] yut = new int[4];
            for (int j = 0; j < 4; j++) {
                yut[j] = sc.nextInt();
            }
            
            int count = 0;
            for (int val : yut) {
                if (val == 0) count++;
            }
            
            if (count == 0) {
                System.out.println("E");
            } else if (count == 1) {
                System.out.println("A");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}