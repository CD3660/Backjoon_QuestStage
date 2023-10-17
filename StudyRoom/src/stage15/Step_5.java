package stage15;

import java.io.*;
import java.math.BigInteger;

public class Step_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			BigInteger bi = new BigInteger(arr[i]+"");
			bw.write(primeCheck(bi)+"\n");
		}
		bw.flush();
		bw.close();
	}
	public static BigInteger primeCheck(BigInteger bi) {
		if(bi.isProbablePrime(10)) {
			return bi;
		} else {
			return bi.nextProbablePrime();
		}
	}
}
