class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int n : numbers){
            answer += (double) n;
        }
        
        System.out.println(answer);
        
        return answer / numbers.length;
    }
}