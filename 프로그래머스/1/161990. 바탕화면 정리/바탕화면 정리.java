class Solution {
    public int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        String[][] arr = new String[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = String.valueOf(wallpaper[i].charAt(j));
            }
        }
        
        // 가장 위에있는 문서의 i인덱스, 가장 왼쪽에 있는 문서의 j인덱스
        int lux = n - 1;
        int luy = m - 1;
        int rdx = 0;
        int rdy = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j  < m; j++){
                if("#".equals(arr[i][j])){
                    if(i < lux){
                        lux = i;
                    }
                    if(j < luy){
                        luy = j;
                    }
                    
                    if(i > rdx){
                        rdx = i;
                    }
                    if(j > rdy){
                        rdy = j;
                    }
                    // System.out.println(lux + ", " + luy);
                }
            }
        }
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int[] answer = {lux, luy, rdx + 1, rdy + 1};
        
        return answer;
    }
}