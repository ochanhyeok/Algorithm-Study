class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        int idx = 0;
        for(int i = 0; i < k; i++){
            idx = i * 2 % len;
            System.out.println(idx);
            answer = numbers[idx];
            idx += 2;
        }
        
        
        return answer;
    }
}