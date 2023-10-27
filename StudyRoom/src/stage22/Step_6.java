package stage22;

import java.io.*;
import java.util.*;

public class Step_6 {
	static int[][] sudoku = new int[9][9];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sudoku(0, 0);
	}

	public static void sudoku(int a, int b) {
		if(b==9) {
			sudoku(a+1, 0);
			return;
		}
		if(a==9) {
			show();
			System.exit(0);
		}
		if(sudoku[a][b]==0) {
			for(int i=1; i<=9; i++) {
				if(check(i, a, b)) {
					sudoku[a][b] = i;
					sudoku(a, b+1);
				}
			}
			sudoku[a][b]=0;
			return;
		}
		sudoku(a, b+1);
	}

	public static boolean check(int num, int a, int b) {
		for(int i = 0; i<9; i++) {
			if(sudoku[a][i]==num) {
				return false;
			}
		}
		for(int i = 0; i<9; i++) {
			if(sudoku[i][b]==num) {
				return false;
			}
		}
		int tempA = a/3;
		int tempB = b/3;
		for(int i=tempA*3; i<tempA*3+3; i++) {
			for(int j=tempB*3; j<tempB*3+3; j++) {
				if(sudoku[i][j]==num) {
					return false;
				}
			}
		}
		return true;
	}

	public static void show() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 8) {
					sb.append(sudoku[i][j] + "\n");
				} else {
					sb.append(sudoku[i][j] + " ");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
