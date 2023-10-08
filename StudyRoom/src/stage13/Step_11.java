package stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = Integer.parseInt(st.nextToken());;
			arr[i][1] = i;
		}
		br.close();

		Arrays.sort(arr, (o1, o2) -> {
			return Integer.compare(o1[0], o2[0]);
		});
		int count = 0;
		int temp = arr[0][0];

		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i][0] != temp) {
				count++;
			}
			temp = arr[i][0];
			arr[i][0] = count;
		}
		Arrays.sort(arr, (o1, o2) -> {
			return Integer.compare(o1[1], o2[1]);
		});
		for (int i = 0; i < n; i++) {
			bw.write(arr[i][0]+"");
			if (i != n - 1) {
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
