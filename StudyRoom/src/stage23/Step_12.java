package stage23;

import java.io.*;
import java.util.*;

public class Step_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n][2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			dp[i][0] = Integer.parseInt(st.nextToken());
		}
		int temp = 0;
		for (int i = n - 2; i >= 0; i--) {
			temp = 0;
			dp[i][1] = 1;
			for (int j = i + 1; j < n; j++) {
				if (dp[j][1] > 0) {
					dp[i][1] += dp[j][1];
					break;
				} else if (dp[j][0] > temp) {
					temp = dp[j][0];
					dp[i][1]++;
				}
			}
		}

		System.out.println();
	}
}