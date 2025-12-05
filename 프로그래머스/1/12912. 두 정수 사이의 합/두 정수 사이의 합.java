class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int n = a;
        int m = b;
        
        if(a > b){
            n = b;
            m = a;
        } 
        
        for(int i = n; i <= m; i++){
            answer += i;
        }
        
        return answer;
    }
}