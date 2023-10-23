package stage20;

import java.io.*;
import java.util.*;

public class Step_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int[] arr = new int[n];
		int[][] arrCount = new int[8001][2];
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			sum += temp;
			arr[i] = temp;
			arrCount[temp + 4000][0]++;
			arrCount[temp + 4000][1] = temp;
		}
		Arrays.sort(arr);
		Arrays.sort(arrCount, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o2[0], o1[0]);
			}
		});
		double avg = (double) sum / n;
		bw.write(Math.round(avg) + "\n");
		bw.write(arr[(n - 1) / 2] + "\n");
		if(arrCount[0][0]==arrCount[1][0]) {
			bw.write(arrCount[1][1] + "\n");
		} else {
			bw.write(arrCount[0][1] + "\n");
		}
		bw.write(arr[n-1]-arr[0]+"\n");
		bw.flush();
		bw.close();
	}
}
