class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        String str = s.toLowerCase();
        char[] arr = str.toCharArray();
        
        for(char c : arr){
            if(c == 'p'){
                pCnt++;
            } else if(c == 'y'){
                yCnt++;
            }
        }
        
        if(pCnt == yCnt){
            return true;
        }
    
        return false;
    }
}