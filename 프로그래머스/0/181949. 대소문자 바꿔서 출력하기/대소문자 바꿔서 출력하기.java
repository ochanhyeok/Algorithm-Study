import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            String str = "";
            if(Character.isUpperCase(ch)){
                str = String.valueOf(ch).toLowerCase();
            } else {
                str = String.valueOf(ch).toUpperCase();
            }
            sb.append(str);
        }
        
        System.out.println(sb);
    }
}