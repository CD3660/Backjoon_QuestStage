package stage15;

import java.io.*;
import java.util.*;

public class Step_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long t = Euclidean(a, b);
		long show=a*b/t;
		bw.write(show + "");
		bw.flush();
		bw.close();
	}
	public static long Euclidean(long a, long b) {
	    if (b == 0)
	        return a;
	    return Euclidean(b, a % b);
	}
}
