package stage05;

import java.util.Scanner;

public class Step_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		String str = scan.next();
		int[][] intArr = new int[2][];
		intArr[0] = new int[str.length()];{
		int[] intArr1 = {3,3,3,3,3,4,3,4};
		intArr[1] = intArr1;
		}
		
		for (int i=0; i<str.length(); i++) {
			char char1 = str.charAt(i);
			intArr[0][i] = char1;
		}
		
		for (int i=0; i<str.length();i++) {
			int a = 65;
			for (int j=0; j<8; j++) {

				for (int k=0; k<intArr[1][j]; k++) {
					if (intArr[0][i]==a) {
						intArr[0][i]=j+3;
						break;
					} else {
						a++;
					}
				}
			}
		}
		
		int time = 0;
		for (int i=0; i<str.length(); i++) {
			time += intArr[0][i];
		}
		System.out.println(time);
		
	}
}