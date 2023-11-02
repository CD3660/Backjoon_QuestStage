package stage26;

import java.io.*;
import java.util.*;

public class Step_1 {
	static int white;
	static int blue;
	static boolean[][] paper;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		paper = new boolean[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				if (st.nextToken().equals("1")) {
					paper[i][j] = true;
				}
			}
		}
		cutQuard(1, n, 1, n);
		System.out.println(white);
		System.out.println(blue);

	}

	public static void cutQuard(int x1, int x2, int y1, int y2) {
		if(x1 == x2) {
			if(paper[x1][y1]) {
				blue++;
			} else {
				white++;
			}
			return;
		}
		boolean check = paper[x1][y1];
		boolean oneColor = true;
		point:for(int i = x1; i<= x2; i++) {
			for(int j = y1; j<=y2; j++) {
				if(check!=paper[i][j]) {
					cutQuard(x1, (x1+x2)/2, y1, (y1+y2)/2);
					cutQuard(x1, (x1+x2)/2, (y1+y2)/2+1, y2);
					cutQuard((x1+x2)/2+1, x2, y1, (y1+y2)/2);
					cutQuard((x1+x2)/2+1, x2, (y1+y2)/2+1, y2);
					oneColor = false;
					break point;
				}
			}
		}
		if(oneColor) {
			if(paper[x1][y1]) {
				blue++;
			} else {
				white++;
			}
		}
	}
}