package stage23;

import java.io.*;
import java.util.*;

public class Step_6 {
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < n; i++) {
			arr[i][0] += min(arr[i-1][1], arr[i-1][2]);
			arr[i][1] += min(arr[i-1][0], arr[i-1][2]);
			arr[i][2] += min(arr[i-1][0], arr[i-1][1]);
		}
		
		
		System.out.println(min(arr[n-1][0],min(arr[n-1][1], arr[n-1][2])));
	}
	public static int min(int a, int b) {
		if(a>b) {
			return b;
		} else {
			return a;
		}
	}
}