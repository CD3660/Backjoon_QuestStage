package stage12;

import java.util.Scanner;

public class Step_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		
		String str = ""+n;
		int length=str.length();
		for (int i=(n-length*10); i<n; i++) {
			String strI = i+"";
			int temp=i;
			int sum = i;
			for (int j=0; j<strI.length(); j++) {
				sum += temp%10;
				temp/=10;
			}
			if (sum == n) {
				System.out.println(i);
				break;
			}
			if (i==(n-1)) {
				System.out.println(0);
			}
		}
	}
}
