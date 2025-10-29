class Solution {
    public long solution(int price, int money, int count) {
        long totalMoney = 0;
        
        for(int i = 1; i <= count; i++){
            totalMoney += (price * i);
        }
        
        if(totalMoney > money){
            return totalMoney - money;
        }

        return 0;
    }
}