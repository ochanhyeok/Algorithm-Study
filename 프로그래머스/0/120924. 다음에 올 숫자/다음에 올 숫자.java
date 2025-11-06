class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[0] == 0 && common[1] == 0){
            return 0;
        }
        int r = common[2] - common[1];
        int t = common[2] / common[1];

        // 등비수열일 경우
        if(common[0] * t == common[1] && common[1] * t == common[2]){
            answer = common[common.length - 1] * t;
        } else{ // 등차수열일 경우
            answer = common[common.length - 1] + r;
        }
        
        
        return answer;
    }
}