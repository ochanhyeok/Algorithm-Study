import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int time = 0;
        
        for(int i = 0; i < str.length(); i++){
            String dial = String.valueOf(str.charAt(i));
            
            if("1".equals(dial)){
                time += 2;        
            }
            else if("A".equals(dial) || "B".equals(dial) || "C".equals(dial)){
                time += 3;
            }
            else if("D".equals(dial) || "E".equals(dial) || "F".equals(dial)){
                time += 4;
            }
            else if("G".equals(dial) || "H".equals(dial) || "I".equals(dial)){
                time += 5;
            }
            else if("J".equals(dial) || "K".equals(dial) || "L".equals(dial)){
                time += 6;
            }
            else if("M".equals(dial) || "N".equals(dial) || "O".equals(dial)){
                time += 7;
            }
            else if("P".equals(dial) || "Q".equals(dial) || "R".equals(dial) || "S".equals(dial)){
                time += 8;
            }
            else if("T".equals(dial) || "U".equals(dial) || "V".equals(dial)){
                time += 9;
            }
            else if("W".equals(dial) || "X".equals(dial) || "Y".equals(dial) || "Z".equals(dial)){
                time += 10;
            }
            else{
                time += 11;
            }
        }
        
        System.out.println(time);
    }
}