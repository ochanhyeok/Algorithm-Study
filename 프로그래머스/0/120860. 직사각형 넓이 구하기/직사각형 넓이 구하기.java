class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = dots[0][0]; // 첫번째 dot의 x좌표
        int b = dots[0][1]; // 첫번째 dot의 y좌표
        int xlen = 0;
        int ylen = 0;
        
        // b랑 y좌표 같은 점 찾아서 x선분길이 계산
        // 좌표 (a, b)에서 y좌표가 다른 점과 거리계산 후 x선분과 곱하면 넓이
        for(int i = 1; i < dots.length; i++){
            for(int j = 1; j < dots[i].length; j++){
                if(b == dots[i][j]){
                    xlen = Math.abs(dots[i][0] - a);
                }
                if(b != dots[i][j]){
                    ylen = Math.abs(dots[i][1] - b);
                }
                System.out.println(xlen + ", " + ylen);
            }
        }
        
        return xlen * ylen;
    }
}