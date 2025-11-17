class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int sum = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i++){
            // 문자가 Z라면 직전 더했던 숫자를 다시 뺌
            if(arr[i].equals("Z")){
                sum -= Integer.parseInt(arr[i - 1]);
            } else {
                sum += Integer.parseInt(arr[i]);
            }
        }
        
        return sum;
    }
}