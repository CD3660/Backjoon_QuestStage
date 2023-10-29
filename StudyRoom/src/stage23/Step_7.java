package stage23;

import java.io.*;
import java.util.*;

public class Step_7 {
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (i != 0) {
					if (j == 0) {
						arr[i][j] += arr[i-1][j];
					} else if(j == i){
						arr[i][j] += arr[i-1][j-1];
					} else {
						arr[i][j] += max(arr[i-1][j-1], arr[i-1][j]);
					}
				}
			}
		}
		int result = arr[n-1][0];
		for(int i=1; i<n; i++) {
			result = max(result, arr[n-1][i]);
		}
		System.out.println(result);
	}
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
}