import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] houses = new int[N];
        for(int i = 0; i < N; i++){
            houses[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(houses);
        
        int left = 1;
        int right = houses[N - 1] - houses[0];
        
        int answer = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(canWifi(houses, mid, M)){
                answer = mid;
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        
        System.out.println(answer);
    }
    
    static boolean canWifi(int[] houses, int mid, int M){
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