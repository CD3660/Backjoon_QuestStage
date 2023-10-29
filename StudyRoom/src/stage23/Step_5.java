package stage23;

import java.io.*;
import java.util.*;

public class Step_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long result = 0;
		long max = 0;
		long temp;
		for (int i = 0; i < n; i++) {
			temp = Long.parseLong(st.nextToken());
			if (i == 0) {
				result = temp;
				max = temp;
			} else {
				if (max<0) {
					max = temp;
				} else {
					max += temp;
				}
				if (max > result) {
					result = max;
				}
			}
		}
		System.out.println(result);
	}
}