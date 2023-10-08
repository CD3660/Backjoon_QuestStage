package stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Step_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2);
			} else {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		for (int i = 0; i < n; i++) {
			if(i<n-1&&!arr[i].equals(arr[i+1])) {
			bw.write(arr[i] + "\n");
			}
		}
		bw.write(arr[n-1] + "\n");
		bw.flush();
		bw.close();
	}
}
