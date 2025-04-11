import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char[] ch = num.toCharArray();
        Arrays.sort(ch);
        String num2 = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            num2 += ch[i];
        }
        System.out.println(Integer.parseInt(num2));
    }
}