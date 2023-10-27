package stage23;

import java.io.*;
import java.util.*;

public class Step_2 {
	static int[][][] run = new int[51][51][51];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			bw.write("w(" + a + ", " + b + ", " + c + ") = " + run(a, b, c)+"\n");
		}

		bw.flush();
		bw.close();
	}

	public static int run(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if (a > 20 || b > 20 || c > 20) {
			run[a][b][c] = run(20, 20, 20);
			return run[a][b][c];
		}
		if (run[a][b][c] != 0) {
			return run[a][b][c];
		}
		if (a < b && b < c) {
			run[a][b][c] = run(a, b, c - 1) + run(a, b - 1, c - 1) - run(a, b - 1, c);
			return run[a][b][c];
		}
		run[a][b][c] = run(a - 1, b, c) + run(a - 1, b - 1, c) + run(a - 1, b, c - 1) - run(a - 1, b - 1, c - 1);
		return run[a][b][c];
	}

}