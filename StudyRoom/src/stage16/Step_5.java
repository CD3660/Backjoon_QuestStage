package stage16;

import java.io.*;
import java.util.*;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> qu = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			qu.offer(Integer.parseInt(st.nextToken()));
		}
		int count = 1;
		while (true) {
			if (qu.contains(count)) {
				while (true) {
					if (qu.peek() == count) {
						qu.remove();
						count++;
						break;
					}
					stack.push(qu.poll());
				}
			}
			if (stack.contains(count)) {
				if(stack.peek()==count) {
					stack.pop();
					count++;
				} else {
					bw.write("Sad");
					break;
				}
			}
			if (qu.isEmpty()) {
				bw.write("Nice");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
