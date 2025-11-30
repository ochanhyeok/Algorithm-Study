class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] arr = new String[m][n];
        boolean[][] remove;
        
        // board를 배열로 변환
        for(int i = 0; i < m; i++){
            String[] temp = board[i].split("");
            for(int j = 0; j < n; j++){
                arr[i][j] = temp[j];
            }
        }
        
        while(true){
            // 지워지는 블록찾기
            remove = new boolean[m][n];
            for(int i = 0; i < m - 1; i++){
                for(int j = 0; j < n - 1; j++){
                    String s = arr[i][j];

                    if(s.equals("")){
                        continue;
                    }

                    if(s.equals(arr[i][j + 1]) && s.equals(arr[i + 1][j + 1]) && s.equals(arr[i + 1][j])){
                        remove[i][j] = true;
                        remove[i][j + 1] = true;
                        remove[i + 1][j + 1] = true;
                        remove[i + 1][j] = true;
                    }
                }
            }

            int removeCnt = 0;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(remove[i][j]){
                        removeCnt++;
                        arr[i][j] = "";
                    }
                }
            }
            
            if(removeCnt == 0){
                break;
            }
            answer+=removeCnt;
            
            // 빈칸 채우기 
            for(int j = 0; j < n; j++){
                int emptyIdx = m - 1;
                
                for(int i = m - 1; i >= 0; i--){
                    if(!arr[i][j].equals("")){
                        String temp = arr[i][j];   
                        arr[i][j] = "";
                        arr[emptyIdx][j] = temp;
                        emptyIdx--;
                    }
                }
            }
        }
        
        return answer;
    }
}