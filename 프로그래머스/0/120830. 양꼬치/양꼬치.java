class Solution {
    public int solution(int n, int k) {
        int totalSatae = 0;
        int totalDrink = 0;
        
        totalSatae = n * 12000;
        
        int temp = n / 10;
        if(temp > 0){
            k = k - temp;
        }
        totalDrink = k * 2000;
        
        return totalDrink + totalSatae;
    }
}