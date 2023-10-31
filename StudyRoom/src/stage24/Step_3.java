package stage24;

import java.io.*;
import java.util.*;

public class Step_3 {
	static int m;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		char[] s = br.readLine().toCharArray();
		arr = new int[s.length][26];
		int alp = s[0] - 97;
		arr[0][alp] = 1;
		for (int i = 1; i < s.length; i++) {
			alp = s[i] - 97;
			for (int j = 0; j < 26; j++) {
				if (j == alp) {
					arr[i][j] = arr[i - 1][j] + 1;
				} else {
					arr[i][j] = arr[i - 1][j];
				}
			}
		}
		int n = Integer.parseInt(br.readLine());
		int tempI, from, to;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			tempI = st.nextToken().charAt(0) - 97;
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			if (from == 0) {
				sb.append(arr[to][tempI] + "\n");
			} else {
				sb.append(arr[to][tempI] - arr[from-1][tempI] + "\n");
			}
		}
		System.out.println(sb.toString());

	}
}