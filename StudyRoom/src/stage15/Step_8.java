package stage15;

import java.io.*;
import java.util.*;

public class Step_8 {
	public static void main(String[] args) throws IOException {
		boolean[] prime = new boolean[1000000];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i < 1000; i++) {
			if (prime[i]) {
				continue;
			}
			for (int j = i * i; j < 1000000; j += i) {
				prime[j] = true;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 2; j < temp / 2 + 1; j++) {
				if (!prime[j]) {
					if(!prime[temp-j]) {
						count++;
					}
				}
			}
			if (i != n - 1) {
				bw.write(count + "\n");
			} else {
				bw.write(count + "");
			}
		}

		bw.flush();
		bw.close();
	}
}
