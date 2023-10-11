package stage14;

import java.io.*;
import java.util.*;

public class Step_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> hm = new HashMap<>(n);
		for (int i=0; i<n; i++) {
			hm.put(br.readLine(), 1);
		}
		String[] strArr = new String[m];
		int count =0;
		for (int i=0; i<m; i++) {
			String str = br.readLine();
			if (hm.containsKey(str)) {
				strArr[i]=str;
				count++;
			}
		}
		Arrays.sort(strArr, Comparator.nullsLast(Comparator.naturalOrder()));
		bw.write(count+"\n");
		for(int i=0; i<count; i++) {
			bw.write(strArr[i]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
