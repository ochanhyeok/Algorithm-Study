import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}