package stage21;

import java.io.*;
import java.util.*;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		bw.write(method(0, 1, n) + "\n");

		bw.flush();
		bw.close();
	}

	public static int method(int a, int b, int n) {
		if(n==0) {
			return a;
		} else if(n==1) {
			return b;
		} else {
			return method(b, a+b, n-1);
		}
	}
}