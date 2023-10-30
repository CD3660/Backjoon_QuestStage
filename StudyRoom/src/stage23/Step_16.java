package stage23;

import java.io.*;
import java.util.*;

public class Step_16 {
	static int[][] arr;
	static int[][] dp;
	static int n;
	static int k;
	static int maxValue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n][2];
		dp = new int[n][k+1];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		System.out.println(calc(n-1, k));
	}

	public static int calc(int idx, int weight) {
		if (idx < 0) {
			return 0;
		}

		if (dp[idx][weight] == 0) {
			if (arr[idx][0] > weight) {
				dp[idx][weight] = calc(idx - 1, weight);
			} else {
				dp[idx][weight] = Math.max(calc(idx - 1, weight), calc(idx - 1, weight - arr[idx][0]) + arr[idx][1]);
			}
		}
		return dp[idx][weight];
	}
}