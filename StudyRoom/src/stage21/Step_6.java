package stage21;

import java.io.*;
import java.util.*;

public class Step_6 {
	static boolean[][] star;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		star = new boolean[max][max];
		starMaker(0, max-1, 0, max-1);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<max; i++) {
			for(int j=0; j<max; j++) {
				if(star[i][j]) {
					sb.append("*");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
	public static void starMaker(int left, int right, int top, int bottom) {
		int temp = (right - left +1)/3;
		if(temp!=1) {
			starMaker(left, left+temp-1, top, top+temp-1);
			starMaker(left, left+temp-1, top+temp, top+temp*2-1);
			starMaker(left, left+temp-1, top+temp*2, bottom);
			starMaker(left+temp, left+temp*2-1, top, top+temp-1);
			starMaker(left+temp, left+temp*2-1, top+temp*2, bottom);
			starMaker(left+temp*2, right, top, top+temp-1);
			starMaker(left+temp*2, right, top+temp, top+temp*2-1);
			starMaker(left+temp*2, right, top+temp*2, bottom);
		} else {
			draw(left, top);
		}
	}
	public static void draw(int left, int top) {
		star[left][top]=true;
		star[left][top+1]=true;
		star[left][top+2]=true;
		star[left+1][top]=true;
		star[left+1][top+2]=true;
		star[left+2][top]=true;
		star[left+2][top+1]=true;
		star[left+2][top+2]=true;
	}
}