import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++) {
            String str = sc.nextLine();
            System.out.println(String.valueOf(str.charAt(0))+String.valueOf(str.charAt(str.length()-1)));
        }
    }
}