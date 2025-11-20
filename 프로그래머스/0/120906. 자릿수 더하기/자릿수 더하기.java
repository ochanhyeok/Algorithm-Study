class Solution {
    public int solution(int n) {
        int sum = 0;
        
        for(int i = n; i > 0; i/=10){
            int num = i % 10;
            sum += num;
        }
        
        return sum;
    }
}