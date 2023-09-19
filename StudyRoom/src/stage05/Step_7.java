package stage05;

import java.util.Scanner;

public class Step_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		int[] intArr = new int[test];
		String[] strArr = new String[test];
		for (int i=0; i<test; i++) {
			intArr[i] = scan.nextInt();
			strArr[i] = scan.next();
		}	
		
		for (int i=0; i<test; i++) {
			for (int j=0; j<strArr[i].length(); j++) {
				for (int k=0; k<intArr[i]; k++) {
					System.out.print(strArr[i].substring(j,j+1));
				}
			}
			System.out.println("");			
		}
	}
}