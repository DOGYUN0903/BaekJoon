import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[9];
        int total = 0;
        
        for (int i = 0; i < 9; i++) {
            numArr[i] = sc.nextInt();
            total += numArr[i];
        }
        
        Arrays.sort(numArr);
        
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - numArr[i] - numArr[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(numArr[k]);
                        }
                    }
                    return;
                }
            }
        }
        
    }
}