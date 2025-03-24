import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String target : croatian) {
            word = word.replace(target, "*"); // *는 아무 글자나 상관 없음, 한 글자로 대체
        }
        System.out.println(word.length());
    }
}