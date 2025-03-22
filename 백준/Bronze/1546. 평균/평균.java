import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(sc.nextDouble());
        }
        double M = list.get(0);
        for(int i = 0; i < N; i++){
            if(list.get(i) > M){
                M = list.get(i);
            }
        }
        for(int i = 0; i < N; i++){
            list.set(i, list.get(i) / M * 100);
        }
        double sum = 0;
        for(int i = 0; i < N; i++){
            sum += list.get(i);
        }
        double avg = sum / N;
        System.out.println(avg);
    }
}