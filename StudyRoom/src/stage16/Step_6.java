package stage16;

import java.io.*;
import java.util.*;

public class Step_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if (str.equals("push")) {
				deq.offer(Integer.parseInt(st.nextToken()));
			} else if (str.equals("pop")) {
				if (deq.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deq.poll() + "\n");
				}
			} else if (str.equals("size")) {
				bw.write(deq.size()+"\n");
			} else if (str.equals("empty")) {
				if (deq.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if (str.equals("front")) {
				if (deq.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deq.peek()+"\n");
				}
			} else if (str.equals("back")) {
				if (deq.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deq.peekLast()+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
