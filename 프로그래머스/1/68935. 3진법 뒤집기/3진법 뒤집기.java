class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        // 3진법 변환 후 reverse
        String trans3 = Integer.toString(n, 3);
        sb.append(trans3).reverse();
        
        String temp = sb.toString();
        // 10진법 변환
        int answer = Integer.parseInt(temp, 3);
        
        return answer;
    }
}