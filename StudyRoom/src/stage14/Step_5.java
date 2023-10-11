package stage14;

import java.io.*;
import java.util.*;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<>(n);
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (hm.get(a) == null) {
				bw.write("0");
			} else {
				bw.write(hm.get(a) + "");
			}
			if (i != m - 1) {
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
