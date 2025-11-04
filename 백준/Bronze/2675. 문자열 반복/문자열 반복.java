import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
           
            int size = str.length();
            for(int j = 0; j < size; j++){
                String s = String.valueOf(str.charAt(j));
                for(int k = 0; k < num; k++){
                    sb.append(s);
                }
            }
            sb.append('\n');
        }
        
        System.out.println(sb);
    }
}