package stage26;

import java.io.*;
import java.util.*;

public class Step_2 {
	static StringBuilder sb = new StringBuilder();
	static boolean[][] screen;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		screen = new boolean[n + 1][n + 1];
		String str;
		for (int i = 1; i <= n; i++) {
			str = br.readLine();
			for (int j = 1; j <= n; j++) {
				if (str.charAt(j-1)=='1') {
					screen[i][j] = true;
				}
			}
		}
		cutQuard(1, n, 1, n);
		System.out.println(sb.toString());

	}

	public static void cutQuard(int x1, int x2, int y1, int y2) {
		if(x1 == x2) {
			if(screen[x1][y1]) {
				sb.append("1");
			} else {
				sb.append("0");
			}
			return;
		}
		boolean check = screen[x1][y1];
		boolean oneColor = true;
		point:for(int i = x1; i<= x2; i++) {
			for(int j = y1; j<=y2; j++) {
				if(check!=screen[i][j]) {
					sb.append("(");
					cutQuard(x1, (x1+x2)/2, y1, (y1+y2)/2);
					cutQuard(x1, (x1+x2)/2, (y1+y2)/2+1, y2);
					cutQuard((x1+x2)/2+1, x2, y1, (y1+y2)/2);
					cutQuard((x1+x2)/2+1, x2, (y1+y2)/2+1, y2);
					sb.append(")");
					oneColor = false;
					break point;
				}
			}
		}
		if(oneColor) {
			if(screen[x1][y1]) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
	}
}