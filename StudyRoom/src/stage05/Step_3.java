package stage05;

import java.util.Scanner;

public class Step_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		String[] strArr = new String[test];
		for (int i = 0; i < test; i++) {
			strArr[i] = scan.next();
		}
		for (int i = 0; i < test; i++) {
			
			String str = strArr[i];
			System.out.print(str.substring(0,1));
			System.out.println(str.substring(str.length()-1,str.length()));
		}

	}
}