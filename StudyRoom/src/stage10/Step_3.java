package stage10;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[2][3];
		for(int i=0; i<3; i++) {
			for (int j=0; j<2; j++) {
				arr[j][i]=scan.nextInt();
			}
		}
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(arr[0][i]==arr[0][j]&&i!=j) {
					arr[0][i]=0;
					arr[0][j]=0;
				}
			}
		}
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(arr[1][i]==arr[1][j]&&i!=j) {
					arr[1][i]=0;
					arr[1][j]=0;
				}
			}
		}
		for(int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j]!=0) {
					System.out.print(arr[i][j]);
				}
			}
			if (i==0) {
				System.out.print(" ");
			}
		}
		
	}
}
