class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // List<Integer> list = new ArrayList<>();
        
        for(int i = -1000; i < 10001; i++){
            int sum = 0;
            answer = new int[num];
            int tempIdx = i;
            for(int j = 0; j < num; j++){
                sum += tempIdx;
                answer[j] = tempIdx;
                tempIdx++;
            }
            
            if(sum == total){
                return answer;
            }
        }
        
        return answer;
    }
}