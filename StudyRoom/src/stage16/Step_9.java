package temp;

import java.io.*;
import java.util.*;

public class Step_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> de = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			switch (t) {
			case 1:
				de.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				de.offer(Integer.parseInt(st.nextToken()));
				break;
			case 3:
				if (de.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(de.pollFirst() + "\n");
				}
				break;
			case 4:
				if (de.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(de.pollLast() + "\n");
				}
				break;
			case 5:
				bw.write(de.size() + "\n");
				break;
			case 6:
				if (de.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				break;
			case 7:
				if (de.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(de.getFirst() + "\n");
				}
				break;
			case 8:
				if (de.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(de.getLast() + "\n");
				}
				break;
			}
		}

		bw.flush();
		bw.close();
	}
}
