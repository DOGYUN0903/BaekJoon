import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        
        int[] numArr = new int[7];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        
        int sum = 0;
        int min = numArr[0];
        
        for (int j = 0; j < numArr.length; j++) {
            if (numArr[j] % 2 != 0) numList.add(numArr[j]);
        }
        
        if (numList.size() == 0) {
            System.out.println(-1);
            return;
        }
        
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        
        Collections.sort(numList);
        
        System.out.println(sum);
        System.out.println(numList.get(0));
    }
}