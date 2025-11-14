class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while(hp > 2){
            if(hp / 5 > 0){
                answer = answer + hp / 5;
                hp = hp % 5;
            } 
            if(hp / 3 > 0){
                answer = answer + hp / 3;
                hp = hp % 3;
            }
        }
        answer = answer + hp;
        
        return answer;
    }
}