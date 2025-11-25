import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String a = sc.next();
        for(int i = 0; i < a.length(); i++){
            sb.append(a.charAt(i)).append('\n');
        }
        
        System.out.println(sb.toString());
    }
}