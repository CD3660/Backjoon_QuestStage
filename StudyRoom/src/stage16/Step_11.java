package stage16;

import java.io.*;
import java.util.*;

public class Step_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> de = new ArrayDeque<Integer>();
		boolean[] check = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp == 0) {
				check[i] = true;
			}
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (check[i]) {
				de.offerFirst(temp);
			}
		}
		int test = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < test; i++) {
			de.offer(Integer.parseInt(st.nextToken()));
			if (i != test - 1) {
				bw.write(de.poll() + " ");
			} else {
				bw.write(de.poll() + "");
			}
		}

		bw.flush();
		bw.close();
	}
}
