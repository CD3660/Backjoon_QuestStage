package temp;

import java.io.*;
import java.util.*;

public class Step_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> deNum = new ArrayDeque<Integer>();
		Deque<Integer> deMove = new ArrayDeque<Integer>();

		for (int i = 0; i < n; i++) {
			deNum.offer(i + 1);
			deMove.offer(Integer.parseInt(st.nextToken()));
		}

		int move = deMove.poll();
		int num = deNum.poll();
		bw.write(num + " ");
		for (int i = 0; i < n - 1; i++) {
			if (move > 0) {
				for (int j = 0; j < move - 1; j++) {
					deMove.offer(deMove.poll());
					deNum.offer(deNum.poll());
				}
				move = deMove.poll();
				num = deNum.poll();
			} else {
				for (int j = 0; j < move * (-1) - 1; j++) {
					deMove.offerFirst(deMove.pollLast());
					deNum.offerFirst(deNum.pollLast());
				}
				move = deMove.pollLast();
				num = deNum.pollLast();
			}
			if (i != n - 1) {
				bw.write(num + " ");
			} else {
				bw.write(num);
			}
		}

		bw.flush();
		bw.close();
	}
}
