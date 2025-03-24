import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        for(int i = 0; i < N; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        int M = score[N-1]; // 최고 점수

        double sum = 0;
        for (int i = 0; i < N; i++){
            sum += ((double)score[i] / M) * 100; // 비율 계산
        }

        double avg = sum / N;
        System.out.println(avg);
    }
}
