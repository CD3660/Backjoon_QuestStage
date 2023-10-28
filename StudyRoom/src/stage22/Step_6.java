package stage22;

import java.io.*;
import java.util.*;

public class Step_6 {
	static int[][] sudoku = new int[9][9];
	static int count;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
				if (sudoku[i][j] == 0) {
					count++;
				}
			}
		}
<<<<<<< HEAD
		point: while (true) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (count == 0) {
						break point;
					}
					sudoku(i, j);
				}
			}
		}
		show();
		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}

	public static void sudoku(int a, int b) {
		int sum = 0;
		boolean check = true;
		for (int i = 0; i < 9; i++) {
			if (sudoku[a][i] == 0 && i != b) {
				check = false;
				break;
			} else {
				sum += sudoku[a][i];
			}
		}
		if (check) {
			count--;
			sudoku[a][b] = 45 - sum;
			return;
		}
		sum = 0;
		check = true;
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][b] == 0 && i != a) {
				check = false;
				break;
			} else {
				sum += sudoku[i][b];
			}
		}
		if (check) {
			sudoku[a][b] = 45 - sum;
			count--;
			return;
		}
		if (a < 3) {
			if (b < 3) {
				sudoku[a][b] = box(0, 0, a, b);
			} else if (b < 6) {
				sudoku[a][b] = box(0, 1, a, b);
			} else {
				sudoku[a][b] = box(0, 2, a, b);
			}
		}
		if (a < 6) {
			if (b < 3) {
				sudoku[a][b] = box(1, 0, a, b);
			} else if (b < 6) {
				sudoku[a][b] = box(1, 1, a, b);
			} else {
				sudoku[a][b] = box(1, 2, a, b);
			}
		} else {
			if (b < 3) {
				sudoku[a][b] = box(2, 0, a, b);
			} else if (b < 6) {
				sudoku[a][b] = box(2, 1, a, b);
			} else {
				sudoku[a][b] = box(2, 2, a, b);
=======
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
>>>>>>> e60fb9a68c3b1211feff4e535f7f8c59c0c1562b
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

<<<<<<< HEAD
	public static int box(int a, int b, int at, int bt) {
		int sum = 0;
		for (int i = a * 3; i < (a + 1) * 3; i++) {
			for (int j = b * 3; j < (b + 1) * 3; j++) {
				if (i == at && j == bt) {
					continue;
				} else {
					if (sudoku[i][j] == 0) {
						return 0;
					}
				}
				sum += sudoku[i][j];
			}
		}
		count--;
		return 45 - sum;
	}

	public static void show() {
=======
	public static void show() {
		StringBuilder sb = new StringBuilder();
>>>>>>> e60fb9a68c3b1211feff4e535f7f8c59c0c1562b
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 8) {
					sb.append(sudoku[i][j] + "\n");
				} else {
					sb.append(sudoku[i][j] + " ");
				}
			}
		}
<<<<<<< HEAD
=======
		System.out.println(sb.toString());
>>>>>>> e60fb9a68c3b1211feff4e535f7f8c59c0c1562b
	}
}
