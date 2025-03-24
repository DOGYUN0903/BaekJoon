import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = -1;
        int maxCol = 0;
        int rowCol = 0;
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
             if(arr[i][j] > max){
                 max = arr[i][j];
                 maxCol = i;
                 rowCol = j;
             }   
            }
        }
        
        System.out.println(max);
        System.out.println((maxCol+1)+ " " + (rowCol+1));
    }
}