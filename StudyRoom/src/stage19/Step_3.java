package stage19;

import java.io.*;
import java.util.*;

public class Step_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int show = 1;
		for (int i = 1; i <= n; i++) {
			show *= i;
		}
		bw.write(show + "\n");

		bw.flush();
		bw.close();
	}
}
