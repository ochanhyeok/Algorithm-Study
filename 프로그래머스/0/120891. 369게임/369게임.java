class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for(int i = order; i > 0; i /= 10){
            int temp = i % 10;
            if(temp == 3 || temp == 6 || temp == 9){
                answer++;
            }
        }
        
        return answer;
    }
}