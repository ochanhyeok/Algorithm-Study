
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String str = br.readLine();
		StringBuilder editor = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());

		Deque<Character> left = new ArrayDeque<>();
		Deque<Character> right = new ArrayDeque<>();

		for (int i = 0; i < str.length(); i++) {
			left.addLast(str.charAt(i));
		}

		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();

			if ("P".equals(cmd)) { // 문자를 커서 왼쪽에 추가
				char c = st.nextToken().charAt(0);
				left.addLast(c);
			} else if ("L".equals(cmd)) { // 커서를 왼쪽으로 한 칸 옮김
				if (!left.isEmpty()) {
					right.addLast(left.removeLast());
				}
			} else if ("D".equals(cmd)) { // 커서를 오른쪽으로 한 칸 옮김
				if (!right.isEmpty()) {
					left.addLast(right.removeLast());
				}
			} else if ("B".equals(cmd)) { // B 커서 왼쪽에 있는 문자를 삭제
				if (!left.isEmpty()) {
					left.removeLast();
				}
			}
		}

		for (char c : left) {
			editor.append(c);
		}

		while (!right.isEmpty()) {
			editor.append(right.removeLast());
		}

		System.out.println(editor.toString());
	}

}