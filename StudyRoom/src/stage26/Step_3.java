package stage26;

import java.io.*;
import java.util.*;

public class Step_3 {
	static int minus;
	static int zero;
	static int plus;
	static int[][] paper;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		paper = new int[n + 1][n + 1];
		int temp;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				temp = Integer.parseInt(st.nextToken());
				if (temp == 1) {
					paper[i][j] = 1;
				} else if (temp == 0) {
					paper[i][j] = 0;
				} else {
					paper[i][j] = -1;
				}
			}
		}
		cutNona(1, 1, n);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
	}

	public static void cutNona(int x, int y, int size) {
		if (size==0) {
			if (paper[x][y] == 1) {
				plus++;
			} else if (paper[x][y] == 0) {
				zero++;
			} else {
				minus++;
			}
			return;
		}
		int check = paper[x][y];
		boolean oneColor = true;
		point: for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (check != paper[i][j]) {
					for(int a = 0; a<3; a++) {
						for(int b = 0; b<3; b++) {
							cutNona(x+size/3*a, y+(size/3*b), size/3);
						}
					}
					oneColor = false;
					break point;
				}
			}
		}
		if (oneColor) {
			if (paper[x][y] == 1) {
				plus++;
			} else if (paper[x][y] == 0) {
				zero++;
			} else {
				minus++;
			}
		}
	}
}