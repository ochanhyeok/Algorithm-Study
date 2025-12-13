class Solution {
    public boolean solution(int x) {
        int n = 0;
        
        for(int i = x; i > 0; i/=10){
            int num = i % 10;
            n += num;
        }
        
        if(x % n == 0){
            return true;
        }
        
        return false;
    }
}