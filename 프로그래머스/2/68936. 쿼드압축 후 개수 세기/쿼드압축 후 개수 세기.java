import java.util.*;

class Solution {
    
    static int[][] arr;
    static int cnt0 = 0, cnt1 = 0;
    /**
    0,0부터 탐색 -> 압축가능하면 방문체크하고 끝
               -> 압축 불가능하면 4개로 분리 -> 각 시작점부터 다시 탐색
    **/
    public int[] solution(int[][] arr) {
        this.arr = arr;
        
        solve(0, 0, arr.length);
        
        return new int[]{cnt0, cnt1};
    }
    
    static void solve(int r, int c, int size){
        if(isQtree(r, c, size)){
            if(arr[r][c] == 0){
                cnt0++;
            } else {
                cnt1++;
            }
            return;
        }
        
        int half = size / 2;
        solve(r, c, half);
        solve(r + half, c, half);
        solve(r, c + half, half);
        solve(r + half, c + half, half);
    }
    
    static boolean isQtree(int r, int c, int size){
        for(int i = r; i < r + size; i++){
            for(int j = c; j < c + size; j++){
                if(arr[i][j] != arr[r][c]){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}