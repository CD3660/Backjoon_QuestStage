package stage24;

import java.io.*;
import java.util.*;

public class Step_1 {
	static int n;
	static int m;
	static int[] arr;
	static int[] sums;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		sums = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum+=arr[i];
			sums[i]=sum;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(sum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())) + "\n");
		}
		System.out.println(sb.toString());
	}
	public static int sum(int from, int to) {
		return sums[to]-sums[from-1];
	}
}