import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] cards = new int[N];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = sc.nextInt();
        }
        
        int maxSum = 0;
        
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if ( sum <= M && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        
        
        System.out.println(maxSum);
    }
}