package stage14;

import java.io.*;
import java.util.*;

public class Step_4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> pocket = new HashMap<>(n);
		String[] strArr = new String[n + 1];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			pocket.put(str, i + 1);
			strArr[i + 1] = str;
		}
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			try {
				int a = Integer.parseInt(str);
				bw.write(strArr[a]+"\n");
			} catch (Exception e) {
				bw.write(pocket.get(str)+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
