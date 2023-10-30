package stage23;

import java.io.*;
import java.util.*;

public class Step_13 {
	static int n;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n][3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			dp[i][0] = Integer.parseInt(st.nextToken());
		}
		dp[n - 1][1] = 1;
		dp[0][2] = 1;
		for (int i = n - 2; i >= 0; i--) {
			lis(i);
		}
		for (int i = 0; i < n; i++) {
			lisR(i);
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < dp[i][1] + dp[i][2]-1) {
				max = dp[i][1] + dp[i][2]-1;
			}
		}

		System.out.println(max);
	}

	public static void lis(int idx) {
		int temp = 1;
		for (int i = idx; i < n; i++) {// 이후의 배열에서 value가 작은 값 중 lis가 가장 큰 값을 받는다.
			if (dp[i][0] < dp[idx][0]) {
				if (dp[i][1] + 1 > temp) {
					temp = dp[i][1] + 1;
				}
			}
		}
		dp[idx][1] = temp;
	}

	public static void lisR(int idx) {// 이전의 배열에서 value가 작은 값 중 lis가 가장 큰 값을 받는다.
		int temp = 1;
		for (int i = 0; i < idx; i++) {
			if (dp[i][0] < dp[idx][0]) {
				if (dp[i][2] + 1 > temp) {
					temp = dp[i][2] + 1;
				}
			}
		}
		dp[idx][2] = temp;
	}
}