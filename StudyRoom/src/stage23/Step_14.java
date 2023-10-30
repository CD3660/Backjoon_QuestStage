package stage23;

import java.io.*;
import java.util.*;

public class Step_14 {
	static int n;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		dp = new int[n][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			dp[i][0] = Integer.parseInt(st.nextToken());
			dp[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(dp, (o1, o2)->{
			return Integer.compare(o1[0], o2[0]);
		});
		int max = 0;
		dp[n-1][2] = 1;
		for (int i = n-2; i >= 0; i--) {
			lis(i);
			if(dp[i][2]>max) {
				max = dp[i][2];
			}
		}
		System.out.println(n-max);
	}
	public static void lis(int idx) {
		int temp = 1;
		for (int i = idx; i < n; i++) {// 이후의 배열에서 value가 작은 값 중 lis가 가장 큰 값을 받는다.
			if (dp[i][1] > dp[idx][1]) {
				if (dp[i][2] + 1 > temp) {
					temp = dp[i][2] + 1;
				}
			}
		}
		dp[idx][2] = temp;
	}
	
}