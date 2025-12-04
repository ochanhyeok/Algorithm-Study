class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int cnt = 0;
                    for(int t = 2; t < sum; t++){
                        if(sum % t == 0){
                            cnt++;
                            break;
                        }
                    }
                    
                    if(cnt == 0){
                        // System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]를 이용해서 " + sum + "을 만들 수 있습니다.");
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}