class Solution {
    public int solution(int[] num_list) {
        int result1 = 0;
        int result2 = 1;
        
        for(int num : num_list){
            result1 += num;
            result2 *= num;
        }
        
        result1 = result1 * result1;
        
        if(result1 > result2){
            return 1;
        }
        
        return 0;
    }
}