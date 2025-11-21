class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 우, 상, 좌, 하
        int xlen = board[0] / 2;
        int ylen = board[1] / 2;
        
        
        for(int i = 0; i < keyinput.length; i++){
            int x = answer[0], y = answer[1];
            if("left".equals(keyinput[i])){
                x += dir[2][0];
                y += dir[2][1];
            } else if("right".equals(keyinput[i])){
                x += dir[0][0];
                y += dir[0][1];
            } else if("up".equals(keyinput[i])){
                x += dir[1][0];
                y += dir[1][1];
            } else if("down".equals(keyinput[i])){
                x += dir[3][0];
                y += dir[3][1];
            }
            
            if((x >= xlen * -1 && x <= xlen) && (y >= ylen * -1 && y <= ylen)){
                answer[0] = x;
                answer[1] = y;
            } 
        }

        return answer;
    }
}