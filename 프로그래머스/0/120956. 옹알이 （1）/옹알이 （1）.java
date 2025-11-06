import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < babbling.length; i++){
            boolean flag = true;
            String str = babbling[i].replace("aya", ".").replace("ye", ".")
                                    .replace("woo", ".").replace("ma", ".");
            System.out.println(str);
            int strCnt = 0;
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if('.' == ch){
                    strCnt++;
                }
                
                System.out.println("strCnt = " + strCnt);
            }
            
            if(strCnt == str.length()){
                cnt++;   
            }            
        }
        
        return cnt;
    }
}