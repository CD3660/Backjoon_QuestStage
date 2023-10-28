package stage23;

import java.io.*;
import java.util.*;

public class Step_3 {
	static long[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long result = 0;
		long max = 0;
		long temp;
		for (int i = 0; i < n; i++) {
			temp = Long.parseLong(st.nextToken());
			if (i == 0) {
				result = temp;
				max = temp;
			}

			if (max < 0 || max < temp) {
				max = temp;
			} else {
				max += temp;
			}
			if (max > result) {
				result = max;
			}
		}
		System.out.println(result);
	}
}