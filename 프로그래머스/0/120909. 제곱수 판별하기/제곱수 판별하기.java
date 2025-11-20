class Solution {
    public int solution(int n) {
        
        for(int i = 1; i <= n; i++){
            long temp = i * i;
            if(temp == n){
                return 1;
            }
        }
        
        return 2;
    }
}