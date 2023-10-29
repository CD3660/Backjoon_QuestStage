package stage23;

import java.io.*;
import java.util.*;

public class Step_9 {
	static Integer[] count;
	static boolean check = true;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		count  = new Integer[1000001];
		count[0] = count [1] = 0;
		System.out.println(calc(n));
	}

	public static int calc(int n) {
		if (count[n] == null) {
			if (n % 6 == 0) {
				count[n] = Math.min(calc(n - 1), Math.min(calc(n / 3), calc(n / 2))) + 1;
			}
			else if (n % 3 == 0) {
				count[n] = Math.min(calc(n / 3), calc(n - 1)) + 1;
			}
			else if (n % 2 == 0) {
				count[n] = Math.min(calc(n / 2), calc(n - 1)) + 1;
			}
			else {
				count[n] = calc(n - 1) + 1;
			}
		}
		return count[n];
	}
}