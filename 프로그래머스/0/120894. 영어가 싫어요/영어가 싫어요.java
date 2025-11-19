class Solution {
    public long solution(String numbers) {
        String result = "";
        String temp = "";
        
        for(int i = 0; i < numbers.length(); i++){
            temp += String.valueOf(numbers.charAt(i));
            
            if("one".equals(temp)){
                result+="1";
                temp = "";
            } else if("two".equals(temp)){
                result+="2";
                temp = "";
            } else if("three".equals(temp)){
                result+="3";
                temp = "";
            } else if("four".equals(temp)){
                result+="4";
                temp = "";
            } else if("five".equals(temp)){
                result+="5";
                temp = "";
            } else if("six".equals(temp)){
                result+="6";
                temp = "";
            } else if("seven".equals(temp)){
                result+="7";
                temp = "";
            } else if("eight".equals(temp)){
                result+="8";
                temp = "";
            } else if("nine".equals(temp)){
                result+="9";
                temp = "";
            } else if("zero".equals(temp)){
                result+="0";
                temp = "";
            }
        }
        
        return Long.parseLong(result);
    }
}