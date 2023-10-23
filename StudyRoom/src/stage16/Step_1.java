package stage16;

import java.io.*;
import java.util.*;

public class Step_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stInt = new Stack<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String temp = st.nextToken();
			if (temp.equals("1")) {
				stInt.push(Integer.parseInt(st.nextToken()));
			}
			if (temp.equals("2")) {
				if (stInt.empty()) {
					bw.write("-1\n");
				} else {
					bw.write(stInt.peek() + "\n");
					stInt.pop();
				}
			}
			if (temp.equals("3")) {
				bw.write(stInt.size() + "\n");
			}
			if (temp.equals("4")) {
				if (stInt.empty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}
			if (temp.equals("5")) {
				if (stInt.empty()) {
					bw.write("-1\n");
				} else {
					bw.write(stInt.peek() + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
	}
}
