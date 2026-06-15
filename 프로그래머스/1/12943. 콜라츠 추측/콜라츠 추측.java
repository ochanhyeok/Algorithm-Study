class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(num > 1){
            if(num % 2 == 0){
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            // System.out.println(num);
        }
        // System.out.println(num);
        return num == 1 ? answer : -1;
    }
}