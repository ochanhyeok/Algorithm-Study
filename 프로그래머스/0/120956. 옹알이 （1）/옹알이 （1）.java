
class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        
        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", ".").replace("ye", ".")
                                    .replace("woo", ".").replace("ma", ".");
            // 마지막으로 .을 ""로 변경
            babbling[i] = babbling[i].replace(".", "");
            
            if(babbling[i].isEmpty()){
                cnt++;
            }
   
        }
        
        return cnt;
    }
}