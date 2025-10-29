
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		String num = sc.next();
		
		for(int i = 0; i < N; i++) {
			sum  += num.charAt(i) - '0';
		}
        
        System.out.println(sum);
        
        sc.close();
	}

}
