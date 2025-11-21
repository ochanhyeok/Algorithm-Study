class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0] * numbers[1];
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j){
                    int num = numbers[i] * numbers[j];
                    if(num > max){
                        max = num;
                    }
                }
            }
        }
        return max;
    }
}