package stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		


		int[] plus = new int[10000001];
		int[] minus = new int[10000001];
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp > 0) {
				plus[temp] = 1;
			} else {
				minus[temp * (-1)] = 1;
			}
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i=0; i<m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if ((temp>0&&plus[temp]==1)||(temp<0&&minus[temp*(-1)]==1)) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			if (i!=m-1) {
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
