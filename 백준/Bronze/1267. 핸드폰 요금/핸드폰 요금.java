import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] timeArr = new int[N];
        for (int i = 0; i < N; i++) {
            timeArr[i] = sc.nextInt();
        }
        
        int sumY = countY(timeArr);
        int sumM = countM(timeArr);
        
        if (sumY == sumM) {
            sb.append("Y ").append("M ").append(String.valueOf(sumY));
        } else if (sumY > sumM) {
            sb.append("M ").append(String.valueOf(sumM));
        } else if (sumY < sumM) {
            sb.append("Y ").append(String.valueOf(sumY));
        }
        System.out.println(sb.toString());
    }
    
    public static int countY(int[] timeArr) {
        int sum = 0;
        for (int time : timeArr) {
            sum += (time / 30 + 1) * 10;
        }
        return sum;
    }
    
    public static int countM(int[] timeArr) {
        int sum = 0;
        for (int time : timeArr) {
            sum += (time / 60 + 1) * 15;
        }
        return sum;
    }
}