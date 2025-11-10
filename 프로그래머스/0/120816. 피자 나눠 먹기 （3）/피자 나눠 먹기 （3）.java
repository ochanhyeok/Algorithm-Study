class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i = 1; i < 100; i++){
            int pizza = slice * i;
            System.out.println("Pizza: " + pizza);
            if(pizza / n > 0){
                return answer = pizza / slice;
            }
        }
        return answer;
    }
}