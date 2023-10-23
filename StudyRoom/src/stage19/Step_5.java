package stage19;

import java.io.*;
import java.math.*;
import java.util.*;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			BigInteger show = new BigInteger("1");
			for (int j = 1; j <= b; j++) {
				show = show.multiply(BigInteger.valueOf(j));
			}
			for (int j = 1; j <= b - a; j++) {
				show = show.divide(BigInteger.valueOf(j));
			}
			for (int j = 1; j <= a; j++) {
				show = show.divide(BigInteger.valueOf(j));
			}
			bw.write(show + "\n");
		}

		bw.flush();
		bw.close();
	}
}
