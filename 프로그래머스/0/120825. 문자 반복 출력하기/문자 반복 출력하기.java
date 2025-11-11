import java.io.*;

class Solution {
    public String solution(String my_string, int n) throws IOException{
        StringBuilder sb = new StringBuilder();
        
        for(int t = 0; t < my_string.length(); t++){
            for(int i = 0;  i < n; i++){
                sb.append(my_string.charAt(t));
            }
        }
        
        return sb.toString();
    }
}