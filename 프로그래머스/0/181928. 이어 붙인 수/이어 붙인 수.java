class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        
        for(int n : num_list){
            if(n % 2 == 0){
                str1 += String.valueOf(n);
            } else {
                str2 += String.valueOf(n);
            }
        }
        
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}