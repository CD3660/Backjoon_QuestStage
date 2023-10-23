package stage19;

import java.io.*;
import java.util.*;

public class Step_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int show = 1;
		for(int i=1; i<=n; i++) {
			show*=i;
		}
		for(int i=1; i<=k; i++) {
			show/=i;
		}
		for(int i=1; i<=n-k; i++) {
			show/=i;
		}
		bw.write(show+"\n");
		
		bw.flush();
		bw.close();
	}
}
