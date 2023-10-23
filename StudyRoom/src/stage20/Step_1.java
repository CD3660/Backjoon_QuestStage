package stage20;

import java.io.*;
import java.util.*;

public class Step_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int temp = Integer.parseInt(st.nextToken());
		int min = temp;
		int max = temp;
		for (int i = 0; i < n - 1; i++) {
			temp = Integer.parseInt(st.nextToken());
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
		}

		bw.write(min * max + "\n");

		bw.flush();
		bw.close();
	}
}