package stage10;

import java.util.Scanner;

public class Step_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int test = scan.nextInt();
		
		int[][] arr = new int[2][test];
		for (int i=0; i<test; i++) {
			for (int j=0; j<2; j++) {
				arr[j][i]=scan.nextInt();
			}
		}
		
		int xMax=arr[0][0], xMin=arr[0][0], yMax=arr[1][0], yMin=arr[1][0];
		
		for (int i=0; i<test; i++) {
			if (arr[0][i]>xMax) {
				xMax=arr[0][i];
			}
			if (arr[0][i]<xMin) {
				xMin=arr[0][i];
			}
		}
		for (int i=0; i<test; i++) {
			if (arr[1][i]>yMax) {
				yMax=arr[1][i];
			}
			if (arr[1][i]<yMin) {
				yMin=arr[1][i];
			}
		}
		System.out.println((xMax-xMin)*(yMax-yMin));
		
	}
}
