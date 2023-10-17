package stage15;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Step_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for(int i=n; i<=m; i++) {
			BigInteger bi = new BigInteger(i+"");
			if(bi.isProbablePrime(10)){
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
