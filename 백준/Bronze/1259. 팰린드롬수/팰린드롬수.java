import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String num = sc.nextLine();
            
            if(num.equals("0")){
                break;
            }
            
            boolean isPelin = true;
            
            for(int i = 0; i < num.length(); i++){
                if(num.charAt(i) != num.charAt(num.length() - 1 - i)){
                    isPelin = false;
                    break;
                }
            }
            
            if (isPelin) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}