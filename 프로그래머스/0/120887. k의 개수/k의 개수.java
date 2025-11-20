class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int s = i; s <= j; s++){
            for(int t = s; t > 0; t/=10){
                int num = t % 10;
                if(num == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}