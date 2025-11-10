class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i < 100; i++){
            int pizza = n * i;
            System.out.println("pizze: " + pizza);
            if(pizza % 6 == 0){
                answer = pizza / 6;
                return answer;
            }
        }
        return answer;
    }
}