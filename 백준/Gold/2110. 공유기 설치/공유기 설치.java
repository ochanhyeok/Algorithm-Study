import java.io.*;
import java.util.*;

public class Main{
    
    static int N, M;
    static int[] houses;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        houses = new int[N];
        
        for(int i = 0; i < N; i++){
            houses[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(houses);
        
        int answer = 0;
        int left = 1;
        int right = houses[N - 1] - houses[0];
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(canWifi(mid)){
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(answer);
    }
    
    static boolean canWifi(int mid){
        int wifiCnt = 1;
        int prevHouse = houses[0];
        
        for(int house : houses){
            if(house - prevHouse >= mid){
                wifiCnt++;
                prevHouse = house;
            }
        }
        
        return wifiCnt >= M;
    }
}