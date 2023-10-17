package stage15;

import java.io.*;

public class Step_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int gcd = Euclidean(arr[1]-arr[0], arr[2]-arr[1]);
		for (int i=3; i<n; i++) {
			gcd = Euclidean(gcd, arr[i]-arr[i-1]);
		}
		bw.write((arr[n-1]-arr[0])/gcd-(arr.length-1)+"");
		bw.flush();
		bw.close();
	}

	public static int Euclidean(int a, int b) {
		if (b == 0)
			return a;
		return Euclidean(b, a % b);
	}
}
