package stage23;

import java.io.*;
import java.util.*;

public class Step_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] result = new long[n][10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0) {
					result[i][j] = 1;
				} else {
					if (j == 0) {
						result[i][j] = result[i - 1][1];
					} else if (j == 9) {
						result[i][j] = result[i - 1][8];
					} else {
						result[i][j] = (result[i - 1][j - 1] + result[i - 1][j + 1])%1000000000;
					}
				}
			}
		}
		long show = 0;
		for(int i=1; i<10; i++) {
			show += result[n-1][i];
		}
		System.out.println(show%1000000000);
	}
}