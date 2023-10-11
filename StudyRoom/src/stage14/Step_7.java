package stage14;

import java.io.*;
import java.util.*;

public class Step_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> hm = new HashMap<>(n);
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			hm.put(st.nextToken(), 1);
		}
		int count = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			if(hm.containsKey(st.nextToken())) {
				count++;
			}
		}
		bw.write(n+m-2*count+"");
		bw.flush();
		bw.close();
	}
}
