package stage21;

import java.io.*;
import java.util.*;

public class Step_3 {
	static int recursion;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			recursion = 0;
			bw.write(palindrom(br.readLine()) + " " + recursion + "\n");

		}
		bw.flush();
		bw.close();
	}

	public static int palindrom(String str) {
		if (str.length() <= 1) {
			recursion++;
			return 1;
		} else {
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				recursion++;
				return palindrom(str.substring(1, str.length() - 1));
			} else {
				recursion++;
				return 0;
			}
		}
	}
}