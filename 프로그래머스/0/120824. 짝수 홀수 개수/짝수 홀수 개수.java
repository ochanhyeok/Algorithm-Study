class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[2];
        
        for(int n : num_list){
            if(n % 2 == 0){
                arr[0]++;
            } else {
                arr[1]++;
            }
        }
        
        return arr;
    }
}