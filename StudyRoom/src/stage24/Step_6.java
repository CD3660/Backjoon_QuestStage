package stage24;

import java.util.*;
import java.io.*;

public class Step_6 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] chess = new int[n + 1][m + 1];
		int[] lineSum = new int[m+1];
		String line;
		char tempChar;
		for (int i = 1; i <= n; i++) {
			line = br.readLine();
			for (int j = 1; j <= m; j++) {
				tempChar = line.charAt(j - 1);
				if (((i + j) % 2 == 0 && tempChar == 'B')||((i + j) % 2 == 1 && tempChar == 'W')) {//+1
					lineSum[j] = lineSum[j-1] + 1;
				} else {
					lineSum[j] = lineSum[j-1];
				}
				chess[i][j] = chess[i-1][j] + lineSum[j];
			}
		}
		int min = k*k;
		int max = 0;
		int tempInt;
		for(int i = k; i<=n; i++) {
			for(int j = k; j<=m; j++) {
				tempInt = chess[i][j] - chess[i-k][j] - chess[i][j-k] + chess[i-k][j-k];
				min = Math.min(min, tempInt);
				max = Math.max(max, tempInt);
			}
		}
		System.out.println(Math.min(min, (k*k)-max));
	}
}