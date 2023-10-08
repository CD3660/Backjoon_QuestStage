package stage12;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		
		String[][] strArr = new String[n][];
		for (int i=0; i<n; i++) {
			String temp = scan.nextLine();
			strArr[i]=temp.split("");
		}
		int count = chess(strArr, 0, 0);
		for (int i=0; i<n-7; i++) {
			for (int j=0; j<m-7; j++) {
				if (chess(strArr, i,j)<count) {
					count = chess(strArr,i,j);
				}
			}
		}
		System.out.println(count);
		
	}
	public static int chess(String[][] strArrArr, int a, int b) {
		int count = 0;
		for (int i=a; i<a+8; i++) {
			for (int j=b; j<b+8; j++) {
				if ((i+j)%2==0) {
					if(strArrArr[i][j].equals("B")) {
						count++;
					}
				} else {
					if(strArrArr[i][j].equals("W")) {
						count++;
					}
				}
			}
		}
		if (64-count<count) {
			count = 64-count;
		}
		return count;
	}
}
