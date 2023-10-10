package stage14;

import java.io.*;
import java.util.*;

public class Step_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] company = new String[n];
		String[] out = new String[n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String temp1 = st.nextToken();
			String temp2 = st.nextToken();
			if (temp2.equals("enter")) {
				company[i] = temp1;
			} else {
				out[i] = temp1;
			}
		}
		br.close();
		Arrays.sort(company, Comparator.nullsLast(Comparator.reverseOrder()));
		Arrays.sort(out, Comparator.nullsLast(Comparator.reverseOrder()));
		int outCout = 0;
		for (int i = 0; i < n; i++) {
			try {
				if (company[i].equals(out[outCout])) {
					company[i] = null;
					outCout++;
				}
			} catch (Exception e) {
			}
		}
		for (int i = 0; i < n; i++) {
			if (company[i] == null) {
				continue;
			}
			bw.write(company[i]);
			if (i != n - 1) {
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
