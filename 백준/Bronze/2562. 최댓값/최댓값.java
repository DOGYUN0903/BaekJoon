import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[9];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        
        int max = numArr[0];
        int index = 0;
        
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
                index = i;
            }
        }
        
        System.out.println(max);
        System.out.println(index + 1);
    }
}