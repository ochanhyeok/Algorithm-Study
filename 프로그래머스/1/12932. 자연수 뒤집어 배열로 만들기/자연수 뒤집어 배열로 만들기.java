class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        // long은 배열이 안되서 n을 String으로 변환후 str의 길이로 int배열 크기를 만듬
        int[] arr = new int[str.length()];
        int idx = 0;
        
        while(n > 0){
            int num = (int) (n % 10);
            arr[idx++] = num;
            n /= 10;
        }
        
        return arr;
    }
}