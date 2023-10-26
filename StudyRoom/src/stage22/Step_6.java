package stage22;

import java.io.*;
import java.util.*;

public class Step_6 {
	static int[][] sudoku = new int[9][9];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		
		
		bw.flush();
		bw.close();
	}
	public static void sudoku(int a, int b) {
		int sum = 0;
		boolean check = true;
		for(int i = 0; i<9; i++) {
			if(sudoku[a][i]==0&&i!=b) {
				check = false;
				break;
			} else {
				sum+=sudoku[a][i];
			}
		}
		if(check) {
			sudoku[a][b] = 45 - sum;
			return;
		}
		sum=0;
		check=true;
		for(int i = 0; i<9; i++) {
			if(sudoku[i][b]==0&&i!=a) {
				check = false;
				break;
			} else {
				sum+=sudoku[i][b];
			}
		}
		if(check) {
			sudoku[a][b] = 45 - sum;
			return;
		}
		int a3 = 0, b3 = 0;
		if(a<3) {
			if(b<3) {
				
			} else if(b<6) {
				b3 = 1;
			} else {
				b3 = 2;
			}
		} if(a<6) {
			if(b<3) {
				a3 = 1;
			} else if(b<6) {
				a3 = 1;	
				b3 = 1;
			} else {
				a3 = 1;		
				b3 = 2;
			}
		} else {
			if(b<3) {
				a3 = 2;				
			} else if(b<6) {
				a3 = 2;		
				b3 = 1;
			} else {
				a3 = 2;	
				b3 = 2;
			}
		}
	}
	public static void box() {
		
	}
	
}
