import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int maxLength = 0;
        
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextLine();
            maxLength = Math.max(maxLength, arr[i].length());
        }
        
        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < 5; j++){
                if (i < arr[j].length()) {          // 해당 글자가 존재하는 경우에만 출력
                    System.out.print(arr[j].charAt(i));
                }
            }
        }
    }
}