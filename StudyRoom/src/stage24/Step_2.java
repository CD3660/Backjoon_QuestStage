package stage24;

import java.io.*;
import java.util.*;

public class Step_2 {
	static int n;
	static int m;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
		}
		int max = arr[m]-arr[0];
		int temp;
		for (int i = m+1; i <= n; i++) {
			temp = arr[i] - arr[i-m];
			if (max < temp) {
				max = temp;
			}
		}
		System.out.println(max);

	}
}