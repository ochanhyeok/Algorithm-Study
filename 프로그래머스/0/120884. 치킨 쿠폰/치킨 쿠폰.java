class Solution {
    public int solution(int chicken) {
        int cpCnt = 0;
        int coupon = chicken;
        
        while(coupon >= 10){
            cpCnt += coupon / 10;
            coupon = (coupon / 10) + (coupon % 10);   
        }
        
        return cpCnt;
    }
}