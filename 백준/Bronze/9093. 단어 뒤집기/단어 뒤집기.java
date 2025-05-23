import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String sentence = br.readLine();
            String[] words = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            
            for (String word : words) {
                sb.append(new StringBuilder(word).reverse().toString()).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}