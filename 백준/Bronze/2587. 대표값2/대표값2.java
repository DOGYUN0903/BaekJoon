import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numArr = new int[5];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        
        Arrays.sort(numArr);
        
        int sum = 0;
        for (int num : numArr) {
            sum += num;
        }
        
        System.out.println(sum/5);
        System.out.println(numArr[2]);
    }
}