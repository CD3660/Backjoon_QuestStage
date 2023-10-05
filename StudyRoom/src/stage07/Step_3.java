package stage07;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] strArr = new String[5];
		for (int i=0; i<5; i++) {
			strArr[i]=scan.nextLine();
		}
		char[][] charArr = new char[5][15];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				try {
				charArr[i][j] = strArr[i].charAt(j);
				} catch (Exception e) {
					charArr[i][j]='-';
				}
			}
		}
		String show = "";
		for (int i=0; i<15; i++) {
			for (int j=0; j<5; j++) {
				if (charArr[j][i]!='-') {
				show += charArr[j][i];
				}
			}
		}
		System.out.println(show);
		
		
	}
}
