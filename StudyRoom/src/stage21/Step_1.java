package stage21;

import java.io.*;
import java.util.*;

public class Step_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		bw.write(factorial(1, n) + "\n");

		bw.flush();
		bw.close();
	}

	public static long factorial(long base, int num) {
		if (num > 0) {
			base *= num;
			return factorial(base, num - 1);
		} else {
			return base;
		}
	}
}