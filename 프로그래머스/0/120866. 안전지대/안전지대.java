class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[][] dir = {
            {-1, 1}, {0, 1}, {1, 1},
            {-1, 0}, {0, 0}, {1, 0},
            {-1, -1}, {0, -1}, {1, -1}
        };
        
        int n = board.length;
        boolean[][] unsafe = new boolean[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    for(int[] d : dir){
                        int nx = i + d[0];
                        int ny = j + d[1];
                        
                        if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                            unsafe[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!unsafe[i][j]){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}