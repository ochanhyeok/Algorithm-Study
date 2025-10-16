import java.io.*;
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length - 1; i++){
            // 앞에서 정렬했기 때문에 인접행렬만 확인
            if(phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }
        }
        
        return true;
    }
}