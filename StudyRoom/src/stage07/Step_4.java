package stage07;

import java.util.Scanner;

public class Step_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arrBig = new int[100][100];

		
		int paper = scan.nextInt();
		int[][] arrColor = new int[paper][2];		
		
		for (int i=0;i<paper;i++) {
			for (int j=0; j<2; j++) {
				arrColor[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0; i<paper; i++) {
			for (int j=arrColor[i][0]; j<arrColor[i][0]+10; j++) {
				for (int k=arrColor[i][1]; k<arrColor[i][1]+10; k++) {
					arrBig[j][k]++;
				}
			}
		}
		int count =0;
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if(arrBig[i][j]!=0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
