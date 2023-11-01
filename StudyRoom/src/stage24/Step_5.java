package stage24;

import java.util.*;
import java.io.*;

public class Step_5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[][] sum = new long[n + 1][n + 1];
		long[][] box = new long[n + 1][n + 1];
		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				if (j == 1) {
					sum[i][j] = sum[i - 1][n] + Long.parseLong(st.nextToken());
				} else {
					sum[i][j] = sum[i][j - 1] + Long.parseLong(st.nextToken());
				}
				box[i][j] = box[i - 1][j] + sum[i][j] - sum[i-1][n];
			}
		}
		StringBuilder sb = new StringBuilder();
		int x1, x2, y1, y2;
		long temp;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken())-1;
			y1 = Integer.parseInt(st.nextToken())-1;
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			temp = box[x2][y2] - box[x1][y2] - box[x2][y1] + box[x1][y1];
			sb.append(temp + "\n");
		}
		System.out.println(sb.toString());

	}
}