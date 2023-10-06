package stage10;

import java.util.Scanner;

public class Step_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if (a==0&&b==0&&c==0) {
				break;
			}
			boolean x= a==b, y= a==c, z= b==c;
			boolean i= a>=b+c, j= b>=a+c, k= c>=a+b;
			if (a==b&&b==c) {
				str+="E";
			} else if (i||j||k) {
				str+="x";
			} else if (x||y||z) {
				str+="I";
			} else {
				str+="S";
			}
		}
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='E') {
				System.out.println("Equilateral");
			}
			if(str.charAt(i)=='I') {
				System.out.println("Isosceles");
			}
			if(str.charAt(i)=='S') {
				System.out.println("Scalene");
			}
			if(str.charAt(i)=='x') {
				System.out.println("Invalid");
			}
		}
	}
}
