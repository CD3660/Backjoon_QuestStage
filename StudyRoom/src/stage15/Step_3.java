package stage15;

import java.io.*;
import java.util.*;

public class Step_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int x = a * d + b * c;
		int y = b * d;
		int z = Euclidean(x, y);
		bw.write(x / z + " " + y / z);

		bw.flush();
		bw.close();
	}

	public static int Euclidean(int a, int b) {
		if (b == 0)
			return a;
		return Euclidean(b, a % b);
	}
}